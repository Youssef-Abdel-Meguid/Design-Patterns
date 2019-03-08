package com.design.pattern.creational.prototype;

public class SowrdMen extends GameUnit{

    private String state = "Idel";

    public void attack() {
        this.state = "Attacking";
    }

    @Override
    public String toString() {
        return "Sowrdmen is: " + this.state + " at position: " + getPosition();
    }

    @Override
    public void reset() {
        this.state = "Idel";
    }
}
