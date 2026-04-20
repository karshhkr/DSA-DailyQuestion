package com.dsa.arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// scanner class 
        int size =sc.nextInt();// input size naam k hisab se numbers arrya banaya  
        int numbers[]= new int[size];
          for (int i=0; i<size; i++)// elements input
          numbers [i]= sc.nextInt();


  
    int x = sc.nextInt();// input element to search


    for(int i =0; i<numbers.length; i++){
if(numbers[i]==x){
        System.out.println("element found at:"+i);
}

    }
}

}