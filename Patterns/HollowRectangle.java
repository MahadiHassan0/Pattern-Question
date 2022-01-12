package com.mahadi.Patterns;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int m=input.nextInt();
        System.out.print("Enter the number of columns:");
        int n= input.nextInt();
        //Outer Loop
        for (int i=1;i<=m;i++){
            for (int j=1;j<=n;j++){
                if (i==1 || j==1 || i==m || j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
