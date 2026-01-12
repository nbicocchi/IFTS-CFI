package com.nbicocchi.exercises.basics;

public class AreaPerimeter {
  public static double area(double l1, double l2) {
    return l1 * l2;
  }

  public static double perimeter(double l1, double l2) {
    return 2 * (l1 + l2);
  }

  public static void main(String[] args) {
    double l1 = 2.0;
    double l2 = 3.0;

    System.out.println("area = " + area(l1, l2));
    System.out.println("perimeter = " + perimeter(l1, l2));
  }
}
