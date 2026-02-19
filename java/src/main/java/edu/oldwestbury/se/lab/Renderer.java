package edu.oldwestbury.se.lab;

import edu.oldwestbury.se.lab.shapes.*;

public class Renderer 
{
    public Rectangle rectangle;
    public Square square;
    public Circle circle;
    
    
    Renderer(Rectangle rectangle) 
    {
        this.rectangle = rectangle;
    }

    Renderer(Square square)
    {
        this.square = square;
    }

    Renderer(Circle circle)
    {
        this.circle = circle;
    }

    void draw() 
    {
        double area = rectangle.getArea();

        // assume implementation

        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
