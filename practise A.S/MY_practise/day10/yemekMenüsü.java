package w02;

public class yemekMenüsü {
    public static void main(String[] args) {
        /*
        steak
        hot dog
        cheeseburger
        -----------------------
        pizza
        pasta
        canoli
        -----------------------
        sushi
        ramen
        fried rice
        dumplings
        -----------------------
        kebab
        manto
        -----------------------
        beriyani
        masal
        curry
        chicken tikka masala
        -----------------------
 */
        String[][] food = {{"steak", "hot dog", "cheeseburger"}, {"pizza", "pasta", "canoli"},
                {"sushi", "ramen", "fried rice", "dumplings"}, {"kebab", "manto"},
                {"beriyani", "masal", "curry", "chicken tikka masala"}};
        for (String[] ülkeler:food
             ) {
            for (String yemek:ülkeler
                 ) {
                System.out.println(yemek);

            }
            System.out.println("-------------------");
        }
        String[]ülkeler={"American","Italian","Asian","Afghani","Indian"};
        System.out.println("*******fori ile cözümü*******");
        for (int i = 0; i < food.length; i++) {
            System.out.println("------"+ülkeler[i]+"----------");
            for (int j = 0; j < food[i].length; j++) {
                System.out.println(food[i][j]);

            }

        }

    }
}
