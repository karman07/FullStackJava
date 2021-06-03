package com.company;

public class Practice_Set_7 {
    static int problem3(int x){
        if (x == 1){
            return 1;
        }else {
            return x + problem3(x-1);
        }

    }

//    static void problem2(int x) {
//        for (int i = 0; i != x; i++) {
//            for (int j = i; j != 0; j--) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//    }

//    static int problem1(int n, int r){
//        int answer = 0;
//        for (int i = 1; i!=r+1; i++){
//            System.out.println(n + " x " + i + " = " + n*i);
//            answer = i*n;
//        }
//        return answer;
//    }

        public static void main(String[] args) {
            // Fab
//        int n1=0,n2=1,n3,i,count=10;
//        System.out.print(n1+" "+n2);//printing 0 and 1
//
//        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
//        {
//            n3=n1+n2;
//            System.out.print(" "+n3);
//            n1=n2;
//            n2=n3;
//        }

            //Problem 1
            //  problem1(3,10);

            //Problem 2
            //problem2(5);

            //Problem 3
            int ok = problem3(3);
            System.out.println(ok);

        }
    }


