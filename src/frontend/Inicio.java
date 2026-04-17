package frontend;

import javax.swing.*;
import java.awt.*;

public class Inicio extends JFrame {
    public static void main(String[] args) {
        new Inicio().setVisible(true);
    }
    public Inicio() {
        setTitle("Carrera BUAP 2026");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel titulo = new JLabel("CARRERA BUAP 2026");
        titulo.setBounds(750, -330, 800, 800);
        titulo.setFont(new Font("Times New Roman", Font.BOLD, 45));

        JSeparator linea1 = new JSeparator();
        linea1.setBounds(30, 130, 1850, 2);

        // <-- Formulario -->

        JLabel usuario = new JLabel("Usuario:");
        usuario.setBounds(850, 200, 200, 50);
        usuario.setFont(new Font("Times New Roman", Font.BOLD, 30));

        JTextField usuarioText = new JTextField(15);
        usuarioText.setBounds(1100, 215, 180, 30);
        usuarioText.setFont(new Font("Times New Roman", Font.BOLD, 15));

        JLabel clave = new JLabel("Clave:");
        clave.setBounds(850, 430, 200, 50);
        clave.setFont(new Font("Times New Roman", Font.BOLD, 30));

        JTextField claveText = new JTextField(15);
        claveText.setBounds(1100, 440, 180, 30);
        claveText.setFont(new Font("Times New Roman", Font.BOLD, 15));

        ImageIcon logoOriginal = new ImageIcon("src/images/Logo_de_la_BUAP.png");
        Image imgRedimensionada = logoOriginal.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        ImageIcon logo = new ImageIcon(imgRedimensionada);

        JLabel logoLabel = new JLabel(logo);
        logoLabel.setBounds(150, 180, 400, 400);

        JSeparator linea2 = new JSeparator();
        linea2.setBounds(30, 680, 1850, 2);

        JButton ingresar = new JButton("Ingresar");
        ingresar.setFont(new Font("Times New Roman", Font.BOLD, 40));
        ingresar.setBounds(250, 800, 250, 80);

        JButton salir = new JButton("Salir");
        salir.setFont(new Font("Times New Roman", Font.BOLD, 40));
        salir.setBounds(1500, 800, 250, 80);

        ingresar.addActionListener(e -> {
            //String usuarioE = usuarioText.getText();
            //String claveE = claveText.getText();

            //if (usuarioE.isEmpty() || claveE.isEmpty()) {
                //JOptionPane.showMessageDialog(null, "Llena todos los campos");
            //} else {
                //JOptionPane.showMessageDialog(null, "Bienvenido: " + usuario);
                dispose();
                new Menu();
            //}
        });


        panel.add(titulo);
        panel.add(usuario);
        panel.add(usuarioText);
        panel.add(clave);
        panel.add(claveText);
        panel.add(logoLabel);
        panel.add(ingresar);
        panel.add(salir);
        panel.add(linea1);
        panel.add(linea2);

        add(panel);
        setVisible(true);
    }
}
