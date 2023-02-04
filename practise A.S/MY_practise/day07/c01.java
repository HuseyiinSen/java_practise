package day07;

import java.util.Arrays;

public class c01 {
    public static void main(String[] args) {

        String str="ahmet";
       CharYapma(str);

    }public static void CharYapma(String str){

        char[] strDizisi=new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
                strDizisi[i]+=str.charAt(i);
        }
        System.out.println(Arrays.toString(strDizisi));

    }

}
