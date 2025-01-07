package com.example.project;

public class Main {
    public static void main(String[] args) {
        TriangleCollection test = new TriangleCollection(2, 5, 7);
        System.out.println(test.totalPerimeter());

        Point p1 = new Point(-5,0);
        Point p2 = new Point(0,7);
        Point p3 = new Point(5,0);

        Point p4 = new Point(-5,0);
        Point p5 = new Point(0,7);
        Point p6 = new Point(4,0);

        Triangle qwe = new Triangle(p1, p2, p3);
        Triangle wer = new Triangle(p4, p5, p6);
        System.out.println(qwe.perimeter()+wer.perimeter());
    }
}