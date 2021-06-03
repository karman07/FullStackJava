package com.company;

public class Methods {
//static  void change(int x){
//    x = 98;
//}
    static  void change2(int[] arr){
        arr[0] = 98;
    }

//    static void joke(){
//        System.out.println("An exercise for " +
//                "people who are out of shape: Begin with a " +
//                "five-pound potato bag in each hand. Extend " +
//                "your arms straight out from your sides, hold them there for...");
//    }

//    static  int logic(int x, int y){
//        int answer = 0;
//        if (x>y){
//            answer = x+y;
//        }else {
//            answer = (x+y)*5;
//        }
//        return answer;
//    }
    public static void main(String[] args) {
          int [] marks = {23,23,32,34,98};
//        int a = 11;
//        int b = 10;
//        int c = logic(a, b);
//        System.out.println(c);
//        joke();
//        int l =  45;
//        change(l);
//        System.out.println(l);
        change2(marks);
        System.out.println(marks[0]);

    }

}
