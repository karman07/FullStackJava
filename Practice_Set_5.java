package com.company;

import java.util.Scanner;

public class Practice_Set_5 {
    public static void main(String[] args) {
        // Problem 1
        /*for (int i = 5; i != 0; i--){
            for (int j = i; j != 0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }*/

        //Problem 2
      /*  Scanner sc = new Scanner(System.in);
        System.out.print("Write number here : ");
        int number = sc.nextInt();
        int answer = 0;
        int i = 0;

        while (i!=number){
            if (i%2==0){
                answer += i;
            }
            i++;
        }
        System.out.println(answer);*/

        //Problem 3
       /* Scanner sc = new Scanner(System.in);
        System.out.print("Write the digit : ");
        int table = sc.nextInt();
        System.out.print("Write the rows : ");
        int rows = sc.nextInt();
        for (int i = 1; i!=rows+1 ; i++){
            System.out.println(table + " x " + i + " = " + table*i);
        }*/

        //Problem 4
       /*  Scanner sc = new Scanner(System.in);
        System.out.print("Write the digit : ");
        int table = sc.nextInt();
        System.out.print("Write the rows : ");
        int rows = sc.nextInt();
        for (int i = rows; i!=0 ; i--){
            System.out.println(table + " x " + i + " = " + table*i);
        }*/

        //Problem 5
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the digit here : ");
        int factorial = sc.nextInt();
        int answer = 1;
        for (int i = 1; i!=factorial+1; i++){
            answer *= i;
            System.out.println(answer);
        }
        System.out.println("The factorial of " + factorial +" is : " + answer );

        //Problem 6
//        int n = sc.nextInt();
//        int sum = 0;
//        int order = String.valueOf(n).length();
//        int copy_n = n;
//        int digit = 0;
//        int ok = 0;
//        while (n>0){
//            digit = n%10;
//            sum += Math.pow(digit, order);
//            ok = n/10;
//            n = ok;
//
//        }
//        if (sum==copy_n){
//            System.out.println("This is a arms strong number");
//        }else {
//            System.out.println("This is not a arms strong number");
//        }


    }
}
