package edu.oldwestbury.se.lab;

import edu.oldwestbury.se.lab.shapes.*;

public class Renderer {
    public Rectangle rectangle;
    
    Renderer(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    void draw() {
        double area = rectangle.getArea();

        // assume implementation

        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
