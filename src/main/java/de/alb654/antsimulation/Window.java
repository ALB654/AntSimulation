package de.alb654.antsimulation;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private Dimension size;

    public Window(Dimension dimension) {
        this.size = dimension;

        InitUI();
    }

    private void InitUI() {
        add(new Panel(new Map()));

        setTitle("Ants Simulation");
        setSize(size);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }

}
