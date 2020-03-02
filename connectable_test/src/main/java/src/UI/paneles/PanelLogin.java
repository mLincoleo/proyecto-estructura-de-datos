package src.UI.paneles;

import src.UI.ventana.VentanaPrincipal;
import src.UI.ventana.VentanaTabla;
import src.connection.Connectable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelLogin extends JPanel implements ActionListener {

    private VentanaPrincipal ventanaPrincipal;
    private JButton botonConectar;
    private JButton botonRegistrar;
    private JButton botonMostrar;
    private boolean logeado;
    private JPanel panelBotones;
    private PanelFormulario panelFormulario;
    private Connectable connectable;

    public PanelLogin(VentanaPrincipal v){
        this.ventanaPrincipal = v;
        initComponents();

    }

    private void initComponents(){
        this.setLayout(new BorderLayout());

        this.panelFormulario = new PanelFormulario();
        connectable = new Connectable("127.0.0.1","TEST_DATABASE","shidopc","ragnarok8393007");
        this.ventanaPrincipal.setTitle(connectable.getLogInUser());
        this.botonConectar = new JButton("Conectar");
        this.botonRegistrar = new JButton("Registrar");
        this.botonMostrar = new JButton("Mostrar");

        this.panelBotones = new JPanel(new FlowLayout());

        this.botonConectar.addActionListener(this);
        this.botonRegistrar.addActionListener(this);
        this.botonMostrar.addActionListener(this);

        this.botonMostrar.setEnabled(false);

        this.panelBotones.add(botonConectar);
        this.panelBotones.add(botonRegistrar);
        this.panelBotones.add(botonMostrar);

        this.add(panelFormulario,BorderLayout.CENTER);
        this.add(this.panelBotones, BorderLayout.PAGE_END);
    }

    public JButton getBotonConectar() {
        return botonConectar;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String user = panelFormulario.getTfUser().getText();
        String pass = panelFormulario.getTfPass().getText();
        if (actionEvent.getSource() == this.botonConectar && !this.logeado){
            try{
                if (!user.contains("ñ")){
                    if(connectable.attempToLogIn(user,pass)){
                        JOptionPane.showMessageDialog(null,"LOAGUEADO");
                        this.ventanaPrincipal.setTitle(connectable.getLogInUser());
                        this.logeado = true;
                        this.botonMostrar.setEnabled(true);
                        this.botonConectar.setText("Desconectar");
                    }else{
                        System.out.println("Failed to connect");
                    }

                }else{
                    JOptionPane.showMessageDialog(null,"Caracter invalido");
                }
                panelFormulario.getTfUser().setText("");
                panelFormulario.getTfUser().setText("");
            }catch (Exception e){
                System.out.println("Fallo");
            }
            panelFormulario.getTfUser().setText("");
            panelFormulario.getTfPass().setText("");


        }else if(actionEvent.getSource() == this.botonRegistrar){
            try{
                connectable.attemptToRegister(panelFormulario.getTfUser().getText(),panelFormulario.getTfPass().getText());
                JOptionPane.showMessageDialog(null,"REGISTRADO");
            }catch (Exception e){
                System.out.println("Fallo");
            }
            panelFormulario.getTfUser().setText("");
            panelFormulario.getTfPass().setText("");

        }else if (actionEvent.getSource() == this.botonMostrar){
            System.out.println("llega hasta la accion");

            VentanaTabla v = new VentanaTabla(connectable,botonMostrar);

        }else if(actionEvent.getSource() == this.botonConectar && this.logeado){
            this.ventanaPrincipal.setTitle("NoUser");
            this.botonMostrar.setEnabled(false);
            this.botonConectar.setText("Conectar");
            this.logeado = false;
        }

    }

}

class PanelFormulario extends JLabel{

    private JPanel panelCampUser;
    private JPanel panelCampPass;

    private JLabel labelUser;
    private JLabel labelPass;

    private JTextField tfUser;
    private JTextField tfPass;

    public PanelFormulario(){
        initComponents();
    }

    private void initComponents() {
        this.setLayout(null);
        this.setIcon(new ImageIcon("/home/shidopc/IdeaProjects/connectable_test/src/main/resources/background.png"));

        panelCampUser = new JPanel(new FlowLayout());
        panelCampPass = new JPanel(new FlowLayout());

        labelUser = new JLabel("Usuario");
        labelPass = new JLabel("Contraseña");
        tfUser = new JTextField(20);
        tfPass = new JTextField(20);
        //--------------------------------------
        panelCampUser.add(labelUser);
        panelCampUser.add(tfUser);
        panelCampPass.add(labelPass);
        panelCampPass.add(tfPass);
        //--------------------------------------

        this.panelCampPass.setBounds(30, 150,400, 30);
        this.panelCampUser.setBounds(30,100, 400, 30);

        this.add(panelCampUser);
        this.add(panelCampPass);
    }

    public JTextField getTfUser() {
        return tfUser;
    }

    public JTextField getTfPass() {
        return tfPass;
    }
}
