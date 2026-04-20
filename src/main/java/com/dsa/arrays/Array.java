package com.dsa.arrays;

import java.util.Scanner;


public class Array {
    public static void main(String[] args) {
       // int arr[]= {2,3,5,6,8};
       
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
         int numbers[]= new int[size];
// input
          for(int i =0;i<size;i++)
          {
            numbers[i] = sc.nextInt();
    }
    //output
         for (int i =0; i<size; i++)
      System.out.println("print all array value "+numbers[i]);

    }
}
