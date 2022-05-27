package de.alb654.antsimulation.entities.ants;

import de.alb654.antsimulation.Vector2d;
import de.alb654.antsimulation.entities.Entity;
import de.alb654.antsimulation.entities.EntityType;
import de.alb654.antsimulation.entities.MoveableEntity;

import java.awt.*;

public class Ant extends MoveableEntity {

    private AntState type;

    public Ant(int posX, int posY, Vector2d direction) {
        super(posX, posY, 4, 4, direction, EntityType.ANT);
    }

    @Override
    public void update(double deltaTime) {
        move(20 * deltaTime, 20 * deltaTime);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(Color.BLACK);
        g.fillRect((int) getPosX(), (int) getPosY(), getWidth(), getHeight());
    }

    @Override
    public void onCollison(Entity other) {

    }

    public AntState getAntState() {
        return type;
    }
}
