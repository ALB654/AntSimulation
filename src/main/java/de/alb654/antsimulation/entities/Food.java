package de.alb654.antsimulation.entities;

import java.awt.*;

public class Food extends StaticEntity {

    public Food(int posX, int posY) {
        super(posX, posY, 10, 10, EntityType.FOOD);
    }

    @Override
    public void update(double deltaTime) {

    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(Color.GREEN);
        g.fillRect(getPosXInt(), getPosYInt(), getWidth(), getHeight());
    }

    @Override
    public void onCollison(Entity other) {

    }
}
