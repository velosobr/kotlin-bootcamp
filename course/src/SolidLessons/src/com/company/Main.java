package com.company;

public class Main {

    public static void main(String[] args) {
        AreaCalculate area = new AreaCalculate();

        Triangle triangle = new Triangle(3, 2);

        System.out.println(area.getShapeArea(triangle));
    }
}

interface Shape {
    double getArea();
}

class Triangle implements Shape {

    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return (base * height) / 2;
    }
}

class Square implements Shape {
    double side;

    public double getArea() {
        return side * side;
    }
}

class AreaCalculate {
    public double getShapeArea(Shape shape) {
        return shape.getArea();
    }

}

