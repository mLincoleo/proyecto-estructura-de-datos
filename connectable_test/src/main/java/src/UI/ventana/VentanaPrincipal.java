package src.UI.ventana;

import src.UI.paneles.PanelLogin;

import javax.swing.*;

public class VentanaPrincipal extends JFrame {

    private PanelLogin panelLogin;

    public VentanaPrincipal(){
        initComponents();
    }

    private void initComponents(){



        this.setSize(460,280);
        this.setDefaultCloseOperation(3);
        this.setTitle("Ventana");
        this.setResizable(false);
        this.setAlwaysOnTop(true);
        this.panelLogin = new PanelLogin(this);
        this.add(panelLogin);
        this.setVisible(true);
    }

}
