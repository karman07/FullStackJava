package com.company;

public class VarArgs {
//    static int sum(int a , int b){
//        int answer = a+b;
//        return answer;
//    }

    static  int sum(int ...args){
        int i = 0;
        int answer = 0;
        while (i!=(args.length)){
            answer += args[i];
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 4 and 5 is : " + sum(4, 5, 10, 24, 465 ));
    }
}
