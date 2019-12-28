package src.app;

import src.UI.ventana.VentanaPrincipal;
import src.connection.Connectable;

public class App {

    public static void main(String[] args) throws Exception{
        Connectable connectable = new Connectable();
        //try{
           // connectable.insertNameToDb(JOptionPane.showInputDialog("Escriba un nombre"));
            //connectable.displayAllContent();
            //connectable.terminateCOnection();
        //}catch (SQLException e){
            //System.out.println("Lost connection with database");
        //}

        VentanaPrincipal v = new VentanaPrincipal();
    }
}
