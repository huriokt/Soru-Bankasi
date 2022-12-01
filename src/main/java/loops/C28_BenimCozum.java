package loops;

import java.util.Scanner;

public class C28_BenimCozum {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int sayac;
//        System.out.println("Bir sayi giriniz: ");
//        int sayi = scan.nextInt();
//        while (sayi>2) {
//            sayac =0;
//            for(int i = 2; i < sayi; i++) {
//                if(sayi%i==0) {
//                    sayac++;
//                }
//            }
//            if(sayac==0) {
//                System.out.print(sayi + " ");
//            }
//            sayi--;
//        }
//
//        System.out.println("*****************");
        Scanner scan = new Scanner(System.in);
        int sayac;
        System.out.println("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int kontrol = 0;

        for (int i = 2; i <= sayi; i++) {

            kontrol = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    kontrol = 1;
                    break;
                }
            }
            if (kontrol == 0) {
                System.out.print(i + " ");
                // sayac++;//kac asal sayi varmis merak edersek

  //              System.out.println(sayac);
            }

        }


    }
}
