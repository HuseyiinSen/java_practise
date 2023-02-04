package w02;

public class mükemmelSayi {
    public static void main(String[] args) {
        int input=6;
       if (mükemmelSayi1(input)) System.out.println(input+" mükemmel sayidir.");
       else System.out.println(input+" mükemmel sayi dağldir.");

    }public static boolean mükemmelSayi1(int sayi){
        int toplam=0;
        for (int i = 1; i <sayi ; i++) {
            if ((sayi%i)==0){
                toplam+=i;

            }

        }

        if (sayi==toplam){
            return true;

        }else
        return false;
    }
}
