package loops;

import java.util.Scanner;

public class Q24_Fibonacci {
    public static void main(String[] args) {

        /*
        Kullanıcıya kaç tane fibonacci sayısı görmek istediğini sorunuz. Ardından bu fibonacci
        sayılarını yazdıran kodu yazınız.

        Örnek: kullanıcı 6 girerse çıktı 1 1 2 3 5 8 13 21 34 55 olacaktır.*/


        Scanner input = new Scanner(System.in);

        System.out.println("Kac tane fibonacci sayisi gormek istiyorsunuz ?");

        int kacSayi = input.nextInt();

        int fib1 = 1;

        int fib2 = 1;

        int fibonacci = 0;

        int i;
        System.out.print(fib1 + " ");
        System.out.print(fib2 + " ");

        for (i = 1; i < kacSayi - 1; i++) {


            fibonacci = fib1 + fib2 ;


            fib1 = fib2 ;


            fib2 = fibonacci ;


            System.out.print(fibonacci + " ");


        }
    }


}