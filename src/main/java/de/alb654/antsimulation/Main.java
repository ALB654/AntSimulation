package de.alb654.antsimulation;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting Ant Simulation...");
        EventQueue.invokeLater(() -> {
            var ex = new Window(new Dimension(1000, 800));
            ex.setVisible(true);
        });
    }

}
