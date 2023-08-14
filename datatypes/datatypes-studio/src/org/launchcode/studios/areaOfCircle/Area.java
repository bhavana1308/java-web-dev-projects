package org.launchcode.studios.areaOfCircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter raduis:");
        Double a = input.nextDouble();
        Double Area=Circle.getArea(a);
        System.out.println("Area:"+ Area);
    }
}
