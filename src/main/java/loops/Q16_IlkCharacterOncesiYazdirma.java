package loops;

import java.util.Scanner;

public class Q16_IlkCharacterOncesiYazdirma {
    public static void main(String[] args) {

 //       Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.
//
//        String str= "yaramaz";
//        String str1 ="";
//        int k = str.indexOf("m");
//
//        for (int i = 0; i <k; i++) {
//            char ch = str.charAt(i);
//
//                str1 += ch;
//            }
//
//        System.out.println(str1);
//        System.out.println();
//
//       // 2.YOL
//
//        String kelme= "yaramaz";
//        String kelime2 ="";
//        for (int i = 0; i < kelme.length(); i++) {
//            String harf = kelme.substring(i,i+1);
//            if (harf.equals("m")){
//                break;
//            }
//            kelime2 += harf;
//        }
//        System.out.println(kelime2);
//        System.out.println();
//
//
//        //3.YOL
//        String kelme1= "yaramaz";
//        String kelme2 ="";
//        int i = 0;
//        while (i<kelme1.length()){
//            String harf = kelme1.substring(i,i+1);
//            if (harf.equals("m")){
//                break;
//            }
//
//            kelme2+=harf;
//            i++;
//        }
//        System.out.println(kelme2);
//        System.out.println();
//
//
 //       4.YOL
/*        String klm1= "yaramaz";
        String klm2 ="";
        int j = 0;
        do {
          String harff = klm1.substring(j,j+1);
          if(harff.equals("m")){
              break;
          }
          klm2+=harff;
           j++;
        }while (j<klm1.length());
        System.out.println(klm2);*/
        //5.YOL
        Scanner input = new Scanner(System.in);

        System.out.println("bir string giriniz");
        String str = input.nextLine();

 /*       for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i) != 'm'){
                System.out.print(str.charAt(i));
            }else {
                System.exit(0);
            }
        }  */
//        //////// while/////////////
 /*      int i=0;
        char ch=str.charAt(i);
        while (ch!='m'){
            System.out.print(ch);
            i++;
            ch=str.charAt(i);
        }
        System.out.println();
*/



//        //////////do/////////////
  /*          int k=0;
        do{
            if (str.charAt(k) != 'm'){
                System.out.print(str.charAt(k));
            }else
                System.exit(0);
            k++;

        }while(str.charAt(k)!='m');      */

















    }

}
