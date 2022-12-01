package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q13_Anagram {
    public static void main(String[] args) {
        /*Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.*/

//Duzeltme istiyor///
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki string giriniz :");
        String str = input.next().toLowerCase();
        String btr = input.next().toLowerCase();
        String srr[] = str.split("");
        Arrays.sort(srr);
        String brr[] = btr.split("");
        Arrays.sort(brr);
        if (btr.length() != str.length()) {
            System.out.println("Anagram Değil");
        } else if (str.isEmpty() || btr.isEmpty()) {
            System.out.println("Anagram Değil");
        } else if (Arrays.equals(srr, brr)) {
            System.out.println("Anagramdır");
        } else {
            System.out.println("Anagram Değil");
        }

    }
}
           

//////Fahri Bey//////////
//        Scanner input = new Scanner(System.in);
//        System.out.println("1. kelimeyi giriniz:  ");
//        String kelime1= input.next();
//        kelime1=kelime1.toLowerCase();
//        System.out.println("2. kelimeyi giriniz:  ");
//        String kelime2= input.next();
//        kelime2=kelime2.toLowerCase();
//
//        int counter=0;
//        if(kelime1.length()==kelime2.length()){
//            for (int i=0;i<kelime1.length();i++){
//                for (int j=0;j<kelime2.length();j++){
//                    if(kelime1.charAt(i)==kelime2.charAt(j)){
//                        counter++;
//                        break;
//                    }
//                }
//            }
//            if(counter==kelime2.length()){
//                System.out.println("Kelime anagramdır.");
//            }
//            else{
//                System.out.println("kelimeler anagram değildir"); // bunu yazmamizin sebebi boyu ayni fakat icerigi farli olursa!!!
//            }
//        }else{
//            System.out.println("kelimeler anagram değildir");
//        }

