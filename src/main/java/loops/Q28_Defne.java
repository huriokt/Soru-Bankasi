package loops;

import java.util.Scanner;

public class Q28_Defne {
    public static void main(String[] args) {  /////Defne Hanim ///////////
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz: ");
        int sayi = scan.nextInt();
        int sayac = 0;
        for(int i=2; i<=sayi; i++){

            int kontrol = 0;
            for (int j = 2; j < i; j++)   {
                if ( i % j == 0){
                    kontrol = 1;
                    break;
                }
            }
            if(kontrol==0) {
                System.out.print( i+"\n");
                sayac++;
            }
        }



    }
}
