// import java.util.*;
import java.lang.Math;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Radius of the Circle:");
    double r = sc.nextDouble();
    double area = Math.PI * r * r;
    System.out.println("The area of the circle is: " + area);
    sc.close();
 }
}
