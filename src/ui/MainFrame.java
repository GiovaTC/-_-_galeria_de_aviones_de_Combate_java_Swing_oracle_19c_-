package ui;

import dao.AvionDAO;
import model.Avion;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Galería de Aviones de Combate");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3, 10, 10));

        try {
            AvionDAO dao = new AvionDAO();
            List<Avion> aviones = dao.obtenerAviones();

            for (Avion a : aviones) {
                add(new AvionPanel(a));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
}