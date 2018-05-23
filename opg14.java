package ch8;

/*  Write a class called Line that represents a line segment between two Points. Your Line objects should have the following methods:
public Line(Point p1, Point p2)
Constructs a new Line that contains the given two Points.
   public Point getP1()
Returns this Line’s first endpoint. public Point getP2()
Returns this Line’s second endpoint. public String toString()
Returns a String representation of this Line, such as "[(22, 3), (4, 7)]". */

import java.awt.*;

public class opg14
{

    Point p1;
    Point p2;

    public opg14(Point p1, Point p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public String toString() {
        return "[" + p1 + ", " + p2 + "]";
    }
}
