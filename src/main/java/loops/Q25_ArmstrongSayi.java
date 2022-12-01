package loops;

import java.util.Scanner;

public class Q25_ArmstrongSayi {
    public static void main(String[] args) {
/*      Bir sayı, her basamağının küpünün toplamına eşitse Armstrong sayısı olarak adlandırılır.
        Örneğin, 153, her basamağın küpüne eşit olan 153= 1 + 125 + 27 veya 407 veya 371 olduğundan bir
        Armstrong sayısıdır. Verilen numaranın Armstrong sayısı olup olmadığını kontrol etmek
        için bir kod yazınız.                                               */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        int sayi = input.nextInt();


        int toplam = 0;

        while(sayi >0){

            int kalan = 0;

            kalan += sayi % 10;
            toplam += kalan*kalan*kalan;

            sayi /= 10;
        }
        System.out.println(toplam);

        if(toplam==sayi){
            System.out.println("Girdiginiz sayi bir Armstrong sayidir.");
        }else {
            System.out.println("Girdiginiz sayi bir Armstrong sayi degildir.");
        }





}
}

