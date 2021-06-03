package com.company;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        //While loop
        /*int i = 0;
        while (i < 1000){
            i++;
            System.out.println(i);
        }*/

        //Quiz 1
        /*int b =100;
        while (b!=201) {
            System.out.println(b);
            b++;
        }*/
        //Do while
       /* int l = 5;
        do{
            l++;
            System.out.println(l);
        }while (l!=5);*/

        //for loop
        /*for (int i = 1; i != 11; i++){
            System.out.println(i);
        }*/

        //Quiz 2
      /*  Scanner sc = new Scanner(System.in);
        System.out.print("Tell number : ");
        int rows = sc.nextInt();
        for (int i = 1; i!=rows+1; i++){
            if (i%2==0){
                System.out.println(i + " is even");
            }else{
                System.out.println(i + " is odd");
            }
        }*/

        //Quiz 3
        Scanner sc = new Scanner(System.in);
        System.out.print("Tell number : ");
        int number = sc.nextInt();
        for (int i = number; i!=0; i--){
            System.out.println(i);
        }
    }
}
