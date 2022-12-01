package arrays;

import java.util.Arrays;

public class Q02_EnUzunEnKisa {
    public static void main(String[] args) {



        String[] brr = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
//veya String[] brr = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
 //       System.out.println(Arrays.toString(brr));

        int enUzun =brr[0].length();

        Arrays.sort(brr);
        for (String w: brr) {
                enUzun = Math.max(enUzun,w.length());
            }
        for (String w : brr) {
            if(enUzun==w.length()){
                System.out.println("en uzun = "+w);
            }

        }

        int enKisa = brr[0].length();
        for (String w : brr) {
            enKisa = Math.min(enKisa,w.length());
        }
        for (String w : brr){
            if (enKisa==w.length()){
                System.out.println("en kisa = "+w);
            }
        }


    }


}

