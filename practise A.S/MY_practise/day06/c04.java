package day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class c04 {
    public static void main(String[] args) {
        /*
         * Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
         * 1-1-2-3-5-8-13-21-34....12345
         */

        //System.out.println("fibo icin sayi gir.");
        //Scanner scan=new Scanner(System.in);
        //int sayi=scan.nextInt();
        int sayi=6;
        List<Integer>fibo=new ArrayList<>();
        int toplam=0;//123456789
        fibo.add(1);
        fibo.add(1);
        int sayac=0;

        for (int i = 2; i <=sayi ; i++) {

            toplam=(fibo.get(fibo.size()-2))+ (fibo.get(fibo.size()-1));
            fibo.add(toplam);

        }
        System.out.println(fibo);

    }
}
