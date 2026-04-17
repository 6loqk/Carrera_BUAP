package frontend;

import javax.swing.*;
import java.awt.*;

public class Inicio extends JFrame {
    public static void main(String[] args) {
        new Inicio().setVisible(true);
    }
    public Inicio() {
        setTitle("Carrera BUAP 2026");
        setSize(900, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel titulo = new JLabel("CARRERA BUAP 2026");
        titulo.setBounds(340, -370, 800, 800);
        titulo.setFont(new Font("Times New Roman", Font.BOLD, 30));

        JSeparator linea1 = new JSeparator();
        linea1.setBounds(30, 80, 820, 2);

        // <-- Formulario -->

        JLabel usuario = new JLabel("Usuario:");
        usuario.setBounds(320, 100, 200, 50);
        usuario.setFont(new Font("Times New Roman", Font.BOLD, 17));

        JTextField usuarioText = new JTextField(15);
        usuarioText.setBounds(510, 110, 150, 25);
        usuarioText.setFont(new Font("Times New Roman", Font.BOLD, 15));

        JLabel clave = new JLabel("Clave:");
        clave.setBounds(320, 150, 200, 50);
        clave.setFont(new Font("Times New Roman", Font.BOLD, 17));

        JTextField claveText = new JTextField(15);
        claveText.setBounds(510, 160, 150, 25);
        claveText.setFont(new Font("Times New Roman", Font.BOLD, 15));

        ImageIcon logoOriginal = new ImageIcon("src/images/Logo_de_la_BUAP.png");
        Image imgRedimensionada = logoOriginal.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon logo = new ImageIcon(imgRedimensionada);

        JLabel logoLabel = new JLabel(logo);
        logoLabel.setBounds(-30, -10, 400, 400);

        JSeparator linea2 = new JSeparator();
        linea2.setBounds(30, 300, 820, 2);

        JButton ingresar = new JButton("Ingresar");
        ingresar.setFont(new Font("Times New Roman", Font.BOLD, 20));
        ingresar.setBounds(120, 340, 150, 50);

        JButton salir = new JButton("Salir");
        salir.setFont(new Font("Times New Roman", Font.BOLD, 20));
        salir.setBounds(650, 340, 150, 50);

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
