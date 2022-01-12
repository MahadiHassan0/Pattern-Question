package com.mahadi.Patterns;

import java.util.Scanner;

public class FloydsTraingle {
    public static void main(String[] args) {
        int number=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }
}
