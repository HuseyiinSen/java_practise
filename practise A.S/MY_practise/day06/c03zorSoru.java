package day06;

import java.util.Arrays;

public class c03zorSoru {

    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};// int[] input={ 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };
        int arr2[] = new int[4];                   //  int[] output=new int[4];
        int toplam = 0, sayac = 0, indexAra = 1;  // int toplam=0;  int index_ara=1;  int sayac=0;

        for (int i = 0; i <4; i++) {     //for (int i = 0; i <output.length ; i++) {
            for (int j = 0; j <1; j++) {  //  for (int j = 0; j <=sayac; j++) {
                toplam += arr[indexAra - 1 + j];//  toplam+=input[index_ara-1+j];
            }
            arr2[i] = toplam;                   //  input[i]=toplam;
            sayac++;
            toplam = 0;
            indexAra += sayac;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
