package com.company;

public class break_and_continue {
    public static void main(String[] args) {
        //break and continue using loops!
        for (int i = 1; i!=10; i++){
            System.out.println(i);
            if (i == 5){
                System.out.println("I continued this loop");
                continue;
            }
          /*  if(i == 5){
                System.out.println("hello");
            }*/
        }

    }
}
