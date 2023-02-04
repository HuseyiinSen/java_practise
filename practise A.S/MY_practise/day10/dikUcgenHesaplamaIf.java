package w02;

import java.util.Scanner;

public class dikUcgenHesaplamaIf {
    public static void main(String[] args) {
        //kullanicidan aldiginiz kenar üzünlükleri bir dik ücgen midir
        System.out.println("birinci kenari giriniz");
        Scanner scan=new Scanner(System.in);
        int birincikenar= scan.nextInt();
        System.out.println("ikinci kenari giriniz");
        int ikincikenar= scan.nextInt();
        System.out.println("ücüncü kenari giriniz");// a*a+b*b=c*c
        int ucuncukenar= scan.nextInt();
        if ((birincikenar*birincikenar)+ (ikincikenar*ikincikenar)==(ucuncukenar*ucuncukenar)||
                (birincikenar*birincikenar)+(ucuncukenar*ucuncukenar)==(ikincikenar*ikincikenar)||
                (ikincikenar*ikincikenar)+(ucuncukenar*ucuncukenar)==(birincikenar*birincikenar)){
            System.out.println("dik ucgendir");}
            else System.out.println("dik ucgen degildir");

            if((birincikenar*birincikenar)+ (ikincikenar*ikincikenar)==(ucuncukenar*ucuncukenar)){
                System.out.println("dik ucgendir");}
            else if ( (birincikenar*birincikenar)+(ucuncukenar*ucuncukenar)==(ikincikenar*ikincikenar)) {
                System.out.println("dik ucgendir");}
            else if ((ikincikenar*ikincikenar)+(ucuncukenar*ucuncukenar)==(birincikenar*birincikenar)){
                System.out.println("dik ucgendir");}
            else System.out.println("dik ucgen degildir");


    }







}
