package src.UI.tabla;

import src.connection.Connectable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;

public class SavedUsersTable extends JPanel {

    private final Connectable connectable;
    private JScrollPane pane;
    private DefaultTableModel tableModel;
    private JTable table;
    private Object[] columnNames;
    private Object[][] rowData;

     public SavedUsersTable(Connectable connectable){
         this.connectable = connectable;
         initComponents();
     }

     private void initComponents(){

         columnNames = new Object[]{"ID","Nombre","Contraseña"};
         try{
             rowData = new Object[connectable.getUsersQuantity()][3];
             connectable.fillRowData(this);
         }catch (SQLException e){
             System.out.println("Unable To get data");
         }

         this.tableModel = new DefaultTableModel(rowData,columnNames);
         this.table = new JTable(tableModel);
         this.pane = new JScrollPane(table);

         this.table.setEnabled(false);
         this.add(pane);

     }

    public Object[][] getRowData() {
        return rowData;
    }
}
