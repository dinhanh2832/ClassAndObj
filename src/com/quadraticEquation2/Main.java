package com.quadraticEquation2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào a: ");
        double a = sc.nextDouble();
        System.out.println("nhập vào b: ");
        double b = sc.nextDouble();
        System.out.println("nhập vào c: ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        quadraticEquation.getRoot();
    }
}
