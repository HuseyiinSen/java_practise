package tekrar;

public class Deneme{
    public static void main(String[] args) {

        Deneme insan01 = new Deneme();
        System.out.println(insan01);
        Deneme insan03 = new Deneme("Ayse Tan",44 );
        System.out.println(insan03);

        //insan03 objesinin ismi Ayse Tan, yasi 44, kilosu 85 olur.



        //insan01 objesinin ismi Ali Can olur.
    }


        String isim = "Ali Can";

        int yas = 33;

        int kilo = 85;



        Deneme( ){

        }

        Deneme(String isim, int yas){

            this.isim = isim;

            this.yas = yas;

        }

        Deneme(String isim){

            this.isim = isim;

        }

    }





