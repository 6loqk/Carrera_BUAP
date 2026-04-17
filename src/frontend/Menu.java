package frontend;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
    public Menu() {
        setTitle("Carrera BUAP 2026");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        // <-- Titulo -->
        JLabel titulo1 = new JLabel("CARRERA BUAP 2026");
        JLabel titulo2 = new JLabel("MENÚ GENERAL");
        titulo1.setBounds(300, -370, 800, 800);
        titulo2.setBounds(340, -330, 800, 800);
        titulo1.setFont(new Font("Times New Roman", Font.BOLD, 27));
        titulo2.setFont(new Font("Times New Roman", Font.BOLD, 27));

        JSeparator linea1 = new JSeparator();
        linea1.setBounds(30, 100, 820, 2);

        // <-- Contenido -->

        JButton hombres = new JButton("Hombres");
        hombres.setBounds(380, 150, 140, 40);
        hombres.setFont(new Font("Times New Roman", Font.BOLD, 25));

        JButton mujeres = new JButton("Mujeres");
        mujeres.setBounds(380, 250, 140, 40);
        mujeres.setFont(new Font("Times New Roman", Font.BOLD, 25));



        panel.add(titulo1);
        panel.add(titulo2);
        panel.add(linea1);
        panel.add(hombres);
        panel.add(mujeres);
        add(panel);
        setVisible(true);
    }
}
