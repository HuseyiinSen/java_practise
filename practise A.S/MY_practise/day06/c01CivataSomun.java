package day06;

public class c01CivataSomun {
    public static void main(String[] args) {
        int[]civata={1,2,3,7,8,9,11,22,33};
        int[]somun={1,2,3,7,8,4,5,6,11,22,33};
        for (int civataEach:civata
             ) {
            for (int somunEach:somun
                 ) {
                if (somunEach==civataEach){
                    System.out.println(somunEach+" somunu "+civataEach+" civatasi ile eslesti");
                    System.out.println("islem tamam");

                }
            }
        }

    }
}
