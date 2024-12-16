//Write a Java program to accept a point (x, y) and find whether it lies on
//the circle or inside the circle or outside the circle. The center of the circle is
//(0, 0) and the radius of the circle is 5. Equation of a circle with (0, 0) as the
//center and r as the radius is given by x2 + y2 = r2.
//1. If x2 + y2 < r2, then the point (x, y) lies within the circle.
//2. If x2 + y2 > r2, then the point (x, y) lies outside the circle.
//3. If x2 + y2 = r2, then the point (x, y) lies on the circle.

import java.util.Scanner;
public class day2_6{
    public static void main(String[] args) {
    System.out.println("NAME : PRIYANGSHU DATTA");
    System.out.println("ROLL NO. = 2330325 ");
    final double radius = 5.0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the x coordinate: ");
    double x = sc.nextDouble();
    System.out.print("Enter the y coordinate: ");
    double y = sc.nextDouble();
    double distanceSquared = x * x + y * y;
    double radiusSquared = radius * radius;
    if (distanceSquared < radiusSquared) {
    System.out.println("The point (" + x + ", " + y + ") lies inside the circle.");
    } else if (distanceSquared > radiusSquared) {
    System.out.println("The point (" + x + ", " + y + ") lies outside the circle.");
    } else {
    System.out.println("The point (" + x + ", " + y + ") lies on the circle.");
    }
    }
}
