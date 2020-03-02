package src.UI.ventana;

import src.UI.tabla.SavedUsersTable;
import src.connection.Connectable;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class VentanaTabla extends JFrame implements WindowListener {

    private final Connectable connectable;
    private JButton mostrar;
    private SavedUsersTable table;

    public VentanaTabla(Connectable connectable, JButton mostrar){
        this.mostrar = mostrar;
        System.out.println("llega hasta construct");
        this.connectable = connectable;
        initComponents();
    }

    private void initComponents() {
        System.out.println("llega hasta el init");
        this.setTitle("Tabla");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);

        this.table = new SavedUsersTable(connectable);
        this.add(this.table);
        this.setAlwaysOnTop(true);
        this.addWindowListener(this);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {
        this.mostrar.setEnabled(false);
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        this.mostrar.setEnabled(true);
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {
        this.mostrar.setEnabled(true);
    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {

    }
}
