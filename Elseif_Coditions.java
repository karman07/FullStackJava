package com.company;
import java.util.Scanner;

public class Elseif_Coditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>50){
            System.out.println("You are experienced");
        }else if(age>40){
            System.out.println("You are semi-experienced");
        }else if(age>30){
            System.out.println("You are semi-semi-experienced");
        }else{
            System.out.println("You are not experienced");
        }
    }
}
