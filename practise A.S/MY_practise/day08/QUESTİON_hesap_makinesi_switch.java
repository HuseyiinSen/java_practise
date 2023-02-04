package w01;

import java.util.Scanner;

public class QUESTİON_hesap_makinesi_switch {
    public static void main(String[] args) {
        /* Kullanicidan iki tamsayi sayi ve islem cinsini alin
         * ve sayilari kullanicinin belirledigi isleme tabii tutup sonucu yazdirin.
         *
         * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
         *
         * Ornek : Inputs : sayilar : 18 , 10  islem : 3
         *         Output : 18 X 10 = 180
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki tamsayı sayi giriniz ve her giriste enter'a basiniz");
        int sayi1= scan.nextInt();
        int sayi2=scan.nextInt();
        System.out.println("işlem cinsini giriniz" +
                "\nislem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme");
        int islemCinsi=scan.nextInt();
        switch (islemCinsi){
            case 1:
                System.out.println("isleminizin sonucu: "+sayi1+sayi2);
            case 2:
                System.out.println("isleminizin sonucu: "+(sayi1-sayi2));
            case 3:
                System.out.println("isleminizin sonucu: "+sayi1*sayi2);
            case 4:
                System.out.println("isleminizin sonucu: "+sayi1/sayi2);




        }

    }
}
