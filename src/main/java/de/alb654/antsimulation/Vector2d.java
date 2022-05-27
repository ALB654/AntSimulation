package de.alb654.antsimulation;

public class Vector2d {

    private double x;
    private double y;

    public Vector2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double length() {
        return Math.sqrt(lengthSq());
    }

    public double lengthSq() {
        return x * x + y * y;
    }

    public void multiply(double m) {
        this.x *= m;
        this.y *= m;
    }

    public void normalise() {
        multiply(1/length());
    }
}
