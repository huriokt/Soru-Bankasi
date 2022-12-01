package arrays;

public class Q07_SesliHarfSayisi {
    public static void main(String[] args) {
        /*
        Verilen bir String'deki sesli harf sayısını bulunuz.
String s = "Apex is an object oriented programming language";

         */
//1.YOL
        String s = "Apex is an object oriented programming language";
        String ss = s.toLowerCase().replaceAll("[^aeiou]", "");
        System.out.println("Sesli harf sayisi = " + ss.length());

        // 2.YOL
        String str = "Apex is an object oriented programming language";
        String[] arr = s.toLowerCase().split("");
        int counter = 0;
        for (String w : arr) {
            switch (w) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;

            }
        }
        System.out.println("counter = " + counter);


    }
}
