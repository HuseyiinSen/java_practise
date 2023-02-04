package w02;

import java.util.ArrayList;
import java.util.List;

public class girilenSayininFibonacciAralıgı {

   static boolean bl ;
  static int ara1;
   static int ara2;

    public static void main(String[] args) {
        int sayi=21;


        fibo(sayi);
        if (bl){
            System.out.println("girdiğiniz sayı:" +sayi+" fibonacci sayilari icinde yer aliyor");
        }else {

            System.out.println("girdiğiniz sayı: " +sayi+ " sayisi "+ ara2+" "+ara1+" "+"arasında bulunuyor.");

        }


    }public static boolean fibo(int sayi) {


        if (sayi < 0) {
            System.out.println("sayi 0'dan küçük olamaz");
        }

        List<Integer> fiboList = new ArrayList<>();
        fiboList.add(0);
        fiboList.add(1);

        for (int i = 2; i < sayi; i++) {
            if (sayi < 0) {
                System.out.println("sayi 0'dan küçük olamaz");
              }

                fiboList.add(fiboList.get(i - 1) + fiboList.get(i - 2));
                if (fiboList.get(i) >= sayi) {
                    break;}

        }
        if (fiboList.get(fiboList.size()-1)==sayi){
            bl=true;}
        else {bl=false;}
                ara1=fiboList.get(fiboList.size()-1);
                ara2=fiboList.get(fiboList.size()-2);
        System.out.println(fiboList);





      return bl;
    }
}