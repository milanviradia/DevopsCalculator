package com.milan.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {

    //To Round-off answer upto 4 decimal places.
    public static DecimalFormat df = new DecimalFormat("#.####");

    public static void main(String[] args){
        int ch;
        double a,b;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("-----------------------------------");
            System.out.println("Calculator Program");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Exit");
            System.out.print("\nEnter your choice : ");

            ch = sc.nextInt();
            if(ch==4)
                break;
            else if(ch>4 || ch<1) {
                System.out.println("Invalid choice");
                continue;
            }
            switch (ch) {
                case 1:
                    System.out.println("Addition");
                    System.out.print("Enter 1st number : ");
                    a = sc.nextDouble();
                    System.out.print("Enter 2nd number : ");
                    b = sc.nextDouble();
                    System.out.println(a +" + "+ b +" = "+ add(a, b));
                    break;
                case 2:
                    System.out.println("Subtraction");
                    System.out.print("Enter 1st number : ");
                    a = sc.nextDouble();
                    System.out.print("Enter 2nd number : ");
                    b = sc.nextDouble();
                    System.out.println(a +" - "+ b +" = "+ subtract(a, b));
                    break;
                case 3 :
                    System.out.println("Multiplication");
                    System.out.print("Enter 1st number : ");
                    a = sc.nextDouble();
                    System.out.print("Enter 2nd number : ");
                    b = sc.nextDouble();
                    System.out.println(a +" * "+ b +" = "+ multiply(a,b));
                    break;
                default:
                    System.out.println("Invalid option");
            }//switch ends
            System.out.println("");
        }//while ends
    }

    public static double add(double a, double b) {
        return Double.parseDouble(df.format(a+b));
    }

    public static double subtract(double a, double b) {
        return Double.parseDouble(df.format(a-b));
    }

    /* Feature added later */
    public static double multiply(double a, double b) {
        return Double.parseDouble(df.format(a*b));
    }

}