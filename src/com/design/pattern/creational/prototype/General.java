package com.design.pattern.creational.prototype;

public class General extends GameUnit{

    private String state = "Idel";

    public void boostMorale() {
        this.state = "MoralBoost";
    }

    @Override
    protected GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException("Reset not supported");
    }

    @Override
    public String toString() {
        return "General state is: " + this.state + " at position: " + getPosition();
    }
}
