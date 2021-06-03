package com.company;

public class For_each_loop {
    public static void main(String[] args) {
     /*   int[] marks ={23,54,65,57,54};
        String[] students = {"LOL","OK","BADHIYA"};
        System.out.println(students.length);
      */

        int[] marks ={23,54,65,57,54};
        //System.out.println(marks.length);

        //1. Display the array (naive way) :

//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[3]);
//

       //2. Using For loop
//        for (int i = 0; i!=marks.length; i++){
//            System.out.println(marks[i]);
//        }

        //Problem 1
//        for (int i = 0; i!=marks.length ; i++){
//           System.out.println(marks[i]);
//       }



        //3. Using for each loop
        for (int element: marks){
            System.out.println(element);
        }
    }
}
