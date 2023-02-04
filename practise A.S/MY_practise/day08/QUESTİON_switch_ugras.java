package w01;

import java.util.Scanner;

public class QUESTİON_switch_ugras {
    public static void main(String[] args) {
        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= scan.nextInt();
        switch (sayi){
            case 1:
                System.out.println(sayi>=0&&sayi<10);
                System.out.println("pozitif sayi");break;
            case 3:
                System.out.println((sayi<0)+"negatif sayi");break;
        }
    }
}
