package com.company;
import java.util.Scanner;

public class Practice_Set_4 {
    public static void main(String[] args) {
        //Problem 1:

      /*  Scanner sc = new Scanner(System.in);
        System.out.print("Tell marks in English : ");
        float eng = sc.nextInt();
        float answer = ((eng*100)/100);
        if (answer < 33){
            System.out.println("you failed in the exam");
        }else{
            System.out.print("Tell marks in Maths : ");
            float maths = sc.nextInt();
            answer = 0;
            answer = ((maths *100)/100);
            if (answer < 33){
                System.out.println("you failed in the exam");
            }else {
                System.out.print("Tell marks in SST : ");
                float SST= sc.nextInt();
                answer = 0;
                answer = ((SST *100)/100);
                if (answer < 33){
                    System.out.println("you failed in the exam");
                }else {
                    answer = (((SST+maths+eng)*100))/300;
                    System.out.println("You are promoted to next class your percentage is : " + answer);
                }
            }
        }*/

        //Problem 2:

    /*    Scanner sc = new Scanner(System.in);
        System.out.print("Tell you income in lakhs : ");
        float lakhs = sc.nextFloat();
        if ((lakhs >= 250000) && (lakhs <= 500000)){
            float answer = (5 * lakhs)/100;
            System.out.println("You have to pay : " + answer);
        }else if ((lakhs >= 500000) && (lakhs <= 1000000)){
            float answer = (20 * lakhs)/100;
            System.out.println("You have to pay : " + answer);
        }else {
            float answer = (30 * lakhs)/100;
            System.out.println("You have to pay : " + answer);
        }*/

        //Problem 3 :

       /* Scanner sc = new Scanner(System.in);
        System.out.print("Write Day number here : ");
        int number = sc.nextInt();
        String days[];
        days = new String[8];
        days[0] = new String("none");
        days[1] = new String("monday");
        days[2] = new String("tuesday");
        days[3] = new String("wednesday");
        days[4] = new String("thursday");
        days[5] = new String("friday");
        days[6] = new String("saturday");
        days[7] = new String("sunday");
        System.out.println(days[number]);*/

        //Problem 4
       /* Scanner sc = new Scanner(System.in);
        System.out.print("Type year here : ");
        int year = sc.nextInt();
        if (year%4 == 0){
            System.out.println("This year is a leap year");
        }else {
            System.out.println("This year is not a leap year");
        }*/

        //Problem 5
        Scanner sc = new Scanner(System.in);
        System.out.print("Write your link here : ");
        String link = sc.nextLine();
        if (link.endsWith(".org")){
            System.out.println("It is a organisation website");
        }else if( (link.endsWith(".com"))){
            System.out.println("It is a commercial website");
        }else if( (link.endsWith(".in"))){
            System.out.println("It is a Indian website");
        }

    }
}
