package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static double calculateCircleArea( double radius){
        return Math.PI * radius * radius;
    }

    public static double calculateTriangleArea(double base, double height){
        return 0.5 * base * height;
    }

    public static double calculateRectangleArea(double length, double width){
        return length * width;
    }

    public static void main(String[] args) {
        System.out.println("+++ Area Calculator +++");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.println("Choose a shape (1-3): ");
        Scanner input = new Scanner(System.in);

        int shape = input.nextInt();

        switch (shape){
            case 1:
                System.out.print("Enter the radius: ");
                double radius = input.nextDouble();
                double resultCircle = calculateCircleArea(radius);
                System.out.print("Area of the circle: ");
                System.out.printf("%.2f", resultCircle);
                break;
            case 2:
                System.out.print("Enter the base: ");
                double base = input.nextDouble();
                System.out.print("Enter the height: ");
                double height = input.nextDouble();

                double resultTriangle = calculateTriangleArea(base,height);
                System.out.print("Area of the triangle: ");
                System.out.printf("%.2f", resultTriangle);
                break;
            case 3:
                System.out.print("Enter the length: ");
                double length = input.nextDouble();
                System.out.print("Enter the width: ");
                double width = input.nextDouble();

                double resultRectangle = calculateRectangleArea(length,width);
                System.out.print("Area of the rectangle: ");
                System.out.printf("%.2f", resultRectangle);
        }

    }
}