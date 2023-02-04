package w01;

public class esitkenarUcgen {
    public static void main(String[] args) {
        int kısa=5;
        int kısa2=6;
        int uzun=8;
        if ((kısa2*kısa2)+(kısa*kısa)==(uzun*uzun)||(kısa2*kısa2)+(uzun*uzun)==(kısa*kısa)||(kısa*kısa)+(uzun*uzun)==(kısa2*kısa2))
            System.out.println("dik ücgendir");
        else System.out.println("dik ücgen degildir");
    }
}
