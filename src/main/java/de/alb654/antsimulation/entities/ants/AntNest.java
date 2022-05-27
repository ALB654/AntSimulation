package de.alb654.antsimulation.entities.ants;

import de.alb654.antsimulation.entities.Entity;
import de.alb654.antsimulation.entities.EntityType;
import de.alb654.antsimulation.entities.StaticEntity;

import java.awt.*;

public class AntNest extends StaticEntity {

    public AntNest(int posX, int posY) {
        super(posX, posY, 30, 30, EntityType.ANT_NEST);
    }

    @Override
    public void update(double deltaTime) {

    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(Color.RED);
        g.fillRect(getPosXInt(), getPosYInt(), getWidth(), getHeight());
    }

    @Override
    public void onCollison(Entity other) {

    }
}
