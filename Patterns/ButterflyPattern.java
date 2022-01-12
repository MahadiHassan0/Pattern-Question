package com.mahadi.Patterns;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= input.nextInt();
        //First half
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for print spaces
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //for print stars
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for (int i=n;i>=1;i--){ //the code will run from nto 1, and "i"(row) should be decrease;
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
