package de.alb654.antsimulation.entities;

import de.alb654.antsimulation.Vector2d;

import java.awt.*;

public abstract class Entity {

    private double posX;
    private double posY;

    private int width;
    private int height;

    private Vector2d direction;

    private final EntityType type;

    public Entity(int posX, int posY, int width, int height, Vector2d direction, EntityType type) {
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
        this.type = type;
        this.direction = direction;
    }

    public abstract void update(double deltaTime);
    public abstract void draw(Graphics2D g);

    public abstract void onCollison(Entity other);

    public EntityType getType() {
        return type;
    }

    public void setDirection(Vector2d direction) {
        this.direction = direction;
    }

    public Vector2d getDirection() {
        return direction;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public int getPosXInt() {
        return (int)posX;
    }

    public int getPosYInt() {
        return (int)posY;
    }
}
