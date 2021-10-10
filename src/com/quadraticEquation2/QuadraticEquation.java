package com.quadraticEquation2;

public class QuadraticEquation {
    double a, b, c,delta,x1,x2;
    public QuadraticEquation() {
    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        return delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
    }
    public double getRoot1() {
        if (this.getDiscriminant() > 0) {
              x1 = (-this.b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
        } else if (this.getDiscriminant() == 0) {
               x1 = (-this.b / (2 * this.a));
        }
        return x1;
    }
    public double getRoot2() {
        if (this.getDiscriminant() > 0) {
            x2 = (-this.b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
        } else if (this.getDiscriminant() == 0) {
            x2 = (-this.b / (2 * this.a));
        }
        return x2;
    }
    public void getRoot(){
        if (this.getDiscriminant() > 0){
            System.out.println("nhiệm của pt là: " + " x1" + this.getRoot1() + " và " + "x2" + this.getRoot2());
        } else if (this.getDiscriminant() == 0){
            System.out.println(" pt có 1 nghiệm là: " + this.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
