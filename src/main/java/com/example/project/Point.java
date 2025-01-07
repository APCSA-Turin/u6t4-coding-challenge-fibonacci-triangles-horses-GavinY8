package com.example.project;

public class Point {
  private int x;
  private int y;
 
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
 
  // Returns distance between this Point object and another Point object
  public double distanceTo(Point other) {
    /* IMPLEMENT ME */
      int otherX = other.getX();
      int otherY = other.getY();
      int xdistance = otherX - x;
      int ydistance = otherY - y;
      return (double)Math.sqrt(Math.pow(xdistance, 2) + Math.pow(ydistance, 2));
  }

  // Returns a string in the format: (x, y)
  public String pointInfo() {
   /* IMPLEMENT ME */
      String str = "(";
      str += x + ", ";
      str += y + ")";
      return str;
  }


  public int getX() {
      return x;
  }
 
  public int getY() {
      return y;
  }

  public void setX(int newX) {
    x = newX;
  }

  public void setY(int newY) {
    y = newY;
  }
}

  