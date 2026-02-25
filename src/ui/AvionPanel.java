package ui;

import model.Avion;

import javax.swing.*;
import java.awt.*;

public class AvionPanel extends JPanel {

    public AvionPanel(Avion avion) {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(Color.GRAY));

        ImageIcon icon = new ImageIcon(
                avion.getImagen().getScaledInstance(
                        150, 100, Image.SCALE_SMOOTH
                )
        );

        JLabel imgLabel = new JLabel(icon, JLabel.CENTER);
        JLabel txt = new JLabel(
                "<html><b>" + avion.getNombre() + "</b><br>" +
                        avion.getPais() + "<br>" +
                        avion.getTipo() + "<br>" +
                        avion.getVelocidad() + "</html>",
                JLabel.CENTER
        );

        add(imgLabel, BorderLayout.CENTER);
        add(txt, BorderLayout.SOUTH);
    }
} 
