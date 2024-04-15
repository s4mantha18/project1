package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("enter a number:");
        int num2 = new Scanner(System.in).nextInt();
        int sum = num1+num2;
        System.out.println("Sum is = " + sum);
    }
}