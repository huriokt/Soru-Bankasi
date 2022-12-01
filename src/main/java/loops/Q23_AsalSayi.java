package loops;

import java.util.Scanner;

public class Q23_AsalSayi {
    public static void main(String[] args) {

        /*   Asal sayı olup olmadığını kontrol etmek için kullanıcıdan bir tam sayı girmesini isteyiniz.
Örnek: kullanıcı 43 girerse çıktı “43 bir asal sayıdır”, kullanıcı 120 girerse “120 asal değildir”
olur, kullanıcı negatif tam sayılar girerse çıktı “Pozitif bir tam sayı giriniz” şeklinde kullanıcıyı
yönlendiriniz.  */


        Scanner input = new Scanner(System.in);
        System.out.println("Asal olup olmadigini kontrol etmek icin pozitif bir tamsayi giriniz: ");
        int sayi = input.nextInt();


        int counter = 0 ;


        if (sayi < 0) {
            System.out.println("Lutfen pozitif bir sayi giriniz.");

        } else {

            if (sayi == 1) {
                System.out.println(sayi + " Sayimiz asal sayi degildir ");
            } else {
                for (int i = 2; i < sayi; i++) {

                    if (sayi % i == 0) {
                        counter++;
                    }
                }

        if(counter==0){
            System.out.println("Sayimiz asal  sayidir");
        } else {


            System.out.println("Sayimiz asal sayi degildir");
        }
    }
}

/////2.YOL////
         sayi= input.nextInt();
        if(sayi>=0){
            if(sayi==0||sayi==1){
                System.out.println("En kücük asal sayı 2 dir.");
                System.exit(0);
            }

            for(int i=2;i<=Math.sqrt(sayi);i++){

                if(sayi%i==0){
                    System.out.println(sayi+" asal sayı değildir");
                    System.exit(0);
                }
            }
            System.out.println(sayi+" asal sayidir.");

        }else{
            System.out.println("Pozitif bir tam sayı giriniz");
        }


    }
}
