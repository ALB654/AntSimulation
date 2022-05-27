package de.alb654.antsimulation;

import de.alb654.antsimulation.entities.Entity;
import de.alb654.antsimulation.entities.Food;
import de.alb654.antsimulation.entities.ants.Ant;
import de.alb654.antsimulation.entities.ants.AntNest;

import java.util.ArrayList;

public class Map {

    private ArrayList<Entity> entities = new ArrayList<>();

    {
        entities.add(new Ant(20, 20, new Vector2d(1, 1)));
        entities.add(new AntNest(100, 100));
        entities.add(new Food(300, 100));
    }

    public void updateEntities(double deltaTime) {
        entities.forEach(e -> e.update(deltaTime));
        entities.forEach(e -> entities.forEach(o -> {
            if(e.getPosX() + e.getWidth() > o.getPosX() && e.getPosX() < o.getPosX() &&
                    e.getPosY() + e.getHeight() > o.getPosY() && e.getPosY() < o.getPosY())  {
                e.onCollison(o);
                o.onCollison(e);
            }
        }));
    }

    public ArrayList<Entity> getEntities() {
        return entities;
    }
}
