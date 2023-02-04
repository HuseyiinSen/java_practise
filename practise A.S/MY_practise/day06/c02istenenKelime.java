package day06;

public class c02istenenKelime {
    public static void main(String[] args) {

        // Verilen bir cumlede istenen kelimenin kac kere gectigini bulup yazdiran
        // bir method olusturalim.  Java kelimesi verilen Java basladi ve bitti. Java meger ne guzelmis.
        // Ne phyton ne C, Java en iyisi cümlesinde 3 kere gecmistir.

        String cumle = "Java basladi ve bitti. Java meger ne guzelmis. Ne phyton ne C, Java en iyisi";

        String istenenkelime= "ali";

      istenenKelime(cumle,istenenkelime);

    }public static void istenenKelime(String str,String istenen){
        String[]arr=str.split(" ");
        int sayac=0;

        for (String eachArr:arr
        ) {
            if (eachArr.equalsIgnoreCase(istenen)){
                sayac++;
            }
        }
        System.out.println(str);
        System.out.println(istenen+" kelimesi yukarida verilencümlede "+sayac+" kere gecmistir.");

    }

}
