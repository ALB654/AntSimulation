package de.alb654.antsimulation.entities;

import de.alb654.antsimulation.Vector2d;

public abstract class StaticEntity extends Entity {

    public StaticEntity(int posX, int posY, int width, int height, EntityType type) {
        super(posX, posY, width, height, new Vector2d(1, 0), type);
    }

}
