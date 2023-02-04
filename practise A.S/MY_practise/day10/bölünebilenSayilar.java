package w02;

public class bölünebilenSayilar {
    public static void main(String[] args) {
        int toplami=0;
        int sayi=1;
        for (int i = 100; i >0 ; i--) {
            if (i%13==0){
                System.out.println(i+" sayisi 13'e tam bölünür.");
                toplami+=i;


            }


        }System.out.println("13'e bölünen sayilarin toplami= "+ toplami);
    }
}
