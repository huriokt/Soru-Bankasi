package loops;

import java.util.Scanner;

public class Q28_KucukAsalSayilar {
    public static void main(String[] args) {

    /*    Belirli bir sayıdan küçük tüm asal sayıları yazdıran bir kod yazınız.
          Örnek: kullanıcı 20 girerse çıktı 2, 3, 5, 7, 11, 13, 17, 19 olacaktır.     */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz: ");
        int sayi = input.nextInt();
        int counter;

        while (sayi>2){
            counter=0;
        for(int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
            counter++;
                }
        }
        if (counter==0){
            System.out.print(sayi+" ");
        }

        sayi--;
        }
        System.out.println(2);

        /////Fahri Bey/////////
 /*
    Belirli bir sayıdan küçük tüm asal sayıları yazdıran bir kod yazınız.
    Örnek: kullanıcı 20 girerse çıktı 2, 3, 5, 7, 11, 13, 17, 19 olacaktır
     */

        int sayi1 = input.nextInt();
        for (int i =2; i <sayi1 ; i++) {
            if(team02(i)){

            }
        }

    }
    public static boolean team02(int i){
        for (int j = 2; j < i/2; j++) {
            if (i%j==0){
                return false;
            }
        }
        return true;
    }






    
}
