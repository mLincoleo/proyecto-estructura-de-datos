package src.connection;

import src.UI.tabla.SavedUsersTable;

import javax.swing.*;
import java.sql.*;
import java.util.UUID;

public class Connectable {

    private Connection connection;
    private Statement statement;
    private ResultSet queryResult;
    private String logInUser;

    public Connectable(String IP,String databaseName,String username,String password){
        logInUser = "NoUser";
        try{

            attempToConnect();
            createStatement();
        }catch (SQLException e){
            if (connection == null){
                JOptionPane.showMessageDialog(null, "Failed to stablish connection to database");
            }
        }catch (ClassNotFoundException nf){
            System.out.println("Wrong Class name");
        }

    }

    public boolean isRegisteredUser(String name) throws SQLException{

        queryResult = statement.executeQuery("SELECT * FROM users WHERE name='" + name + "'");
        while (queryResult.next()){
            return true;
        }
        return false;
    }

    private boolean validUserAndPass(String name, String  pass){
        return (name.length() <= 20 && name.length() > 1) && (pass.length() <= 20 && pass.length() > 1);
    }

    public String getLogInUser(){
        return logInUser;
    }

    public boolean attempToLogIn(String name, String pass) throws Exception{
        if (validUserAndPass(name, pass) && isRegisteredUser(name)){
            queryResult = statement.executeQuery("SELECT * FROM users WHERE name='" + name + "' AND pass='" +pass+ "'");
            while (queryResult.next()){
                System.out.println("La id del usuario es: " + queryResult.getString(1));
                this.logInUser = queryResult.getString(2);
                return true;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Contraseña y/o Usuario incorrecta(o) o invalida(o)");

        }
        return false;
    }

    public boolean attemptToRegister(String name, String pass) throws Exception{
        if (validUserAndPass(name, pass) && !isRegisteredUser(name)){
            statement.executeUpdate("INSERT INTO users (id,name,pass) VALUES (NULL,'"+name+"','"+pass+"');");
            return true;
        }
        JOptionPane.showMessageDialog(null, "Usuario ya registrado o datos invalidos");
        return false;
    }

    private void attempToConnect() throws java.sql.SQLException,ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://"+IP+"/"+databasename,username,password);
    }

    private void createStatement() throws java.sql.SQLException{
        statement = connection.createStatement();
    }

    public void insertNameToDb(String name) throws java.sql.SQLException{
        statement.executeUpdate("INSERT INTO TABLE_TEST2 (id, name) VALUES (NULL, '"+name+"');");

    }

    public int getUsersQuantity() throws SQLException{
        queryResult = statement.executeQuery("SELECT * FROM users");
        int usersQuantity = 0;
        while (queryResult.next()){
            usersQuantity++;
        }
        return usersQuantity;
    }

    public void fillRowData(SavedUsersTable table) throws SQLException{
        queryResult = statement.executeQuery("SELECT * FROM users");
        int currentUser = 0;
        while (queryResult.next()){
            for (int i = 0; i < table.getRowData()[currentUser].length; i++){
                table.getRowData()[currentUser][i] = queryResult.getString(i+1);
            }
            currentUser++;
        }
    }

    public void deleteAllData() throws java.sql.SQLException{
        statement.executeUpdate("TRUNCATE users");
    }

    public void displayAllContent() throws java.sql.SQLException{
        queryResult = statement.executeQuery("SELECT * FROM TABLE_TEST2");
        while (queryResult.next()) {
            System.out.println(queryResult.getString(1) + ", " + queryResult.getString(2));

        }

    }

    public void terminateCOnection() throws java.sql.SQLException{
        connection.close();
        System.exit(0);
    }
}
