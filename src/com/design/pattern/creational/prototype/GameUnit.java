package com.design.pattern.creational.prototype;

import javafx.geometry.Point3D;

public abstract class GameUnit implements Cloneable{

    private Point3D position;

    public GameUnit() {
        this.position = Point3D.ZERO;
    }

    public GameUnit(double x, double y, double z) {
        this.position = new Point3D(x, y, z);
    }

    public Point3D getPosition() {
        return position;
    }

    public void move(Point3D direction, double distance) {
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }

    public abstract void reset();

    public void initialize() {
        this.position = Point3D.ZERO;
        reset();
    }

    @Override
    protected GameUnit clone() throws CloneNotSupportedException {
        GameUnit unit = (GameUnit) super.clone();
        unit.initialize();
        return unit;
    }
}
