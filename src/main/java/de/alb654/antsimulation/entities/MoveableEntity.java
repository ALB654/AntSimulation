package de.alb654.antsimulation.entities;

import de.alb654.antsimulation.Vector2d;

public abstract class MoveableEntity extends Entity {

    public MoveableEntity(int posX, int posY, int width, int height, Vector2d direction, EntityType type) {
        super(posX, posY, width, height, direction, type);
    }

    public void move(double dx, double dy) {
        setPosX(getPosX() + dx);
        setPosY(getPosY() + dy);
    }

    public void teleport(int x, int y) {
        setPosX(x);
        setPosY(y);
    }

}
