package com.company;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        //Rock Paper Scissors
        Scanner sc = new Scanner(System.in);
        int max = 3;
        int min = 1;
        int range = max - min + 1;
        System.out.println("Hello and welcome to my Rock Paper Scissors game");
        String options[];
        options = new String[4];
        options[0] = new String("none");
        options[1] = new String("rock");
        options[2] = new String("paper");
        options[3] = new String("scissors");
        int choice = (int)(Math.random() * range) + min;
        System.out.print("Write your choice here : ");
        String computer_choice = options[choice] ;
        String user_choice = sc.nextLine();
        System.out.println();
        if (user_choice.equals(computer_choice)){
            System.out.println("It's a draw");
        }else if (user_choice.equals("rock") && computer_choice.equals("paper")){
            System.out.println("Computer Won this \n");
        }else if (user_choice.equals("paper") && computer_choice.equals("scissors")){
            System.out.println("Computer Won this match\n");
        }else if (user_choice.equals("scissors") && computer_choice.equals("rock")){
            System.out.println("Computer Won this match\n");
        }else {
            System.out.println("You Won this match");
        }
        System.out.println("You chose :  " + user_choice);
        System.out.println("Computer chose :  " + computer_choice);
    }
}
