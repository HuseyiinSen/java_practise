package tekrar;

public class switchIfcözümü {
    public static void main(String[] args) {
        int sayi = 11;

        if (sayi / 10==1)
            System.out.print("on ");
        else if (sayi / 10==2)
            System.out.print("yirmi ");
        else if (sayi / 10==3)
            System.out.print("otuz ");
        else if (sayi / 10==4)
            System.out.print("kırk ");
        else if (sayi / 10==5)
            System.out.print("elli ");
        else if (sayi / 10==6)
            System.out.print("altmıs ");
        else if (sayi / 10==7)
            System.out.print("yetmiş ");
        else if (sayi / 10==8)
            System.out.print("seksen ");
        else
        System.out.print("doksan ");


        if (sayi%10==1)
            System.out.print("bir");
        else if (sayi%10==2)
            System.out.print("iki");
        else if (sayi%10==3)
            System.out.print("üç");
        else if (sayi%10==4)
            System.out.print("dört");
        else if (sayi%10==5)
            System.out.print("beş");
        else if (sayi%10==6)
            System.out.print("altı");
        else if (sayi%10==7)
            System.out.print("yedi");
        else if (sayi%10==8)
            System.out.print("sekiz");
        else if (sayi%10==9)
            System.out.print("dokuz");


        System.out.println("");
        System.out.println("**********switch ile çözümü*********");

        int birlerBasamagı=sayi%10;
        int onlarBasamağı=sayi/10;

        switch (onlarBasamağı){
            case 1:
                System.out.print("on ");break;
            case 2:
                System.out.print("yirmi ");break;
            case 3:
                System.out.println("otuz ");break;
            case 4:
                System.out.print("kırk ");break;
            case 5:
                System.out.print("elli ");break;
            case 6:
                System.out.print("altmıs ");break;
            case 7:
                System.out.print("yetmis ");break;
            case 8:
                System.out.print("seksen ");break;
            case 9:
                System.out.print("doksan ");break;

        }
        switch (birlerBasamagı){
            case 1:
                System.out.println("bir");break;
            case 2:
                System.out.print("iki");break;
            case 3:
                System.out.print("üc");break;
            case 4:
                System.out.print("dört");break;
            case 5:
                System.out.print("bes");break;
            case 6:
                System.out.print("altı");break;
            case 7:
                    System.out.print("yedi");break;
            case 8:
                System.out.print("sekiz");break;
            case 9:
                System.out.print("dokuz");break;












        }






    }
}