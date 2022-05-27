package de.alb654.antsimulation;

import de.alb654.antsimulation.entities.Entity;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    private Map map;

    private boolean exit = false;
    private long lastUpdate = System.currentTimeMillis();

    public Panel(Map map) {
        this.map = map;
        gameLoop();
    }

    private void gameLoop() {
        new Thread(() -> {
            while(!exit) {
                long time = System.currentTimeMillis();
                map.updateEntities((double)(time - lastUpdate)/1000);
                lastUpdate = time;

                repaint();
            }
        }).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }

    private void doDrawing(Graphics g) {

        var g2d = (Graphics2D) g;

        //g2d.setBackground(Color.WHITE);
        //g2d.clearRect(0, 0, getSize().width, getSize().height);

        for(Entity entity : map.getEntities()) {
            entity.draw(g2d);
            g2d.setColor(Color.WHITE);
        }
    }

    public void setExit(boolean exit) {
        this.exit = exit;
    }
}
