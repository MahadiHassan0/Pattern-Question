package com.mahadi.Patterns;

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n= input.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
