package com.mahadi.Patterns;
import java.util.*;
public class InverseOfInverseHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        for (int i =1; i<=n;i++){
            //for printing the space
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //for printing the star
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
