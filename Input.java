package com.company;
import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        /*System.out.print("Enter Number 1 : ");
        float num1 = sc.nextFloat();
        System.out.println("");
        System.out.print("Enter Number 2 : ");
        float num2 = sc.nextFloat();
        float sum = num1+num2;
        System.out.print("\n");
        System.out.println(sum);*/
      //  boolean b1 = sc.hasNextInt();
       // System.out.println(b1);
        String str = sc.nextLine();
        System.out.println(str);

    }
}
