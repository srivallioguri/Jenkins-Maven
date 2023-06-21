package program.sample.controller;
import java.util.*;
class Calci {
public int add(int i, int j) {
        System.out.println("Addition of " + i + "," + j + " is: " + (i + j));
        return i + j;
    }
public int mul(int i, int j) {
        System.out.println("Multiplication of " + i + "," + j + " is: " + (i * j));
        return i * j;
    }
public int sub(int i, int j) {
        System.out.println("Subtraction of " + i + "," + j + " is: " + (i - j));
        return i - j;
    }
public double div(double i, double j) {
        if (j != 0) {
            System.out.println("Division of " + i + "," + j + " is: " + (i / j));
            return i / j;
        } else {
            System.out.println("Division with 0 is not possible");
            return 0;
        }
    }
}
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Simple Calculator");
        System.out.println();
        Calci cal = new Calci();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a, b;
        a = 10;
        b = 15;
        cal.add(a, b);
        cal.mul(a, b);
        cal.sub(a, b);
        cal.div(a, b);
        sc.close();
    }
}
