package com.company;
import  java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to marks calculator");
        System.out.print("Please tell your marks out of 100 in maths : ");
        float maths = sc.nextFloat();
        System.out.println("");
        System.out.print("Please tell your marks out of 100 in science : ");
        float science = sc.nextFloat();
        System.out.println("");
        System.out.print("Please tell your marks out of 100 in English : ");
        float English = sc.nextFloat();
        System.out.println("");
        System.out.print("Please tell your marks out of 100 in Hindi : ");
        float Hindi = sc.nextFloat();
        System.out.println("");
        System.out.print("Please tell your marks out of 100 in sst : ");
        float sst = sc.nextFloat();
        System.out.println("");
        float percentage = (((maths+science+sst+English+Hindi)*100)/500);
        System.out.println(percentage);
    }
}
