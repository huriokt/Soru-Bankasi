package loops;

public class Q08_ArdisikTekSayilar {
    public static void main(String[] args) {

       /* 20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk
        bırakarak yazdırmak için gereken kodu yazınız.*/

        for (int i = 20; i >2 ; i--) {
            if(i%2!=0){
                System.out.print(i+" ");
        }

    }
        System.out.println("****************");
        int i = 20;
        while (i >2 ) {
            if (i % 2 != 0) {
                System.out.print(i + " ");

            }
            i--;
        }
        System.out.println("*****************");

        int j =20 ;
        do {

            if (j % 2 != 0) {
                System.out.print(j + " ");

            }
            j--;
        }while (j >2);




















    }


}
