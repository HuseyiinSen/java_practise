package w02;

public class stringKarakterBulma {
    public static void main(String[] args) {
        String input="bugunlerde havalar ıyıce sogudu.";
        char chr='a';
        int sayac=0;
        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i)=='a'){
                sayac++;

            }
            if (input.charAt(i)=='c')break;

        }
        System.out.println(sayac);
    }
}
