package com.company;

public class Multidimensional {
    public static void main(String[] args) {
       // int marks[]; //-1 dimensional array
        int flats[][]; //-2 dimensional array
        flats  = new int[2][3];
        flats[0][0] = 100;
        flats[0][1] = 101;
        flats[0][2] = 102;
        flats[1][0] = 103;
        flats[1][1] = 104;
        flats[1][2] = 105;

        //MultiDimensional Array loop (Important)
        for (int i = 0; i!=flats.length ; i++){
           for (int j = 0; j<flats[i].length ; j++){
               System.out.print(flats[i][j]);
               System.out.print(" ");
           }
            System.out.print("\n");
        }
    }
}
