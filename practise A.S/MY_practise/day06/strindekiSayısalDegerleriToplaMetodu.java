package day06;

import java.util.Arrays;

public class strindekiSayısalDegerleriToplaMetodu {
    public static void main(String[] args) {

        String input="sen12ben52";
        System.out.println(topla(input));

    }public static int topla(String str){
        String[] strArr=str.split("");      // [s, e, n, 1, 2, b, e, n, 5, 2]
        int basket=0;
/*
        for (String each:strArr
             ) {
            if (Character.isDigit(each.charAt(0))){
               basket+=Integer.valueOf(each);

            }

        }
        */




        for (int i = 0; i <strArr.length; i++) {

            if (Character.isDigit(strArr[i].charAt(0))){
                basket+=Integer.valueOf(strArr[i]);

            }


        }

        return basket;


    }





}
