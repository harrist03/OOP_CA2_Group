package org.example;

public class Box implements IMeasurableContainer {

    private double length, width, depth, weight;

    public Box(double length, double width, double depth, double weight) {
        this.length = length;
        this.width = width;
        this.depth = depth;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double rectangularVolume() {
        return length*width*depth;
    }
}
