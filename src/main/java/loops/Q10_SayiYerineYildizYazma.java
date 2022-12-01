package loops;

import java.sql.Array;

public class Q10_SayiYerineYildizYazma {
    public static void main(String[] args) {
        /*
        Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
        işaretiyle yazdırmak için gereken kodu yazınız.
            Örneğin; 75.4238 ´ *4*2*3*8                                                                               */

        String str = "75.4238";
        String str2 =  str.split("\\.")[1];

                //1.YOL
        for (int i = 0 ;i<str2.length();i++){
            System.out.print("*"+str2.charAt(i));
        }

       // 2.YOL
        int i =0;
        while (i<str2.length()){

            i++;
        }
        System.out.print("*"+str2.charAt(i));















//        int idx = str.indexOf(".");
//        //      System.out.println(idx);
//        String s = str.substring(idx + 1);
//        //       System.out.println(s);
//        String m = "";
//        for (int i = 0; i < s.length(); i++) {
//
//            m += "*" + s.charAt(i);
//
//            //       System.out.print("*"+s.charAt(i));
//        }
//
//        System.out.println(m);
//
//
//        //2.YOL
//        int i = 0;
//        String k = "";
//        while (i < s.length()) {
//
//            k += "*" + s.charAt(i);
//            i++;
//        }
//        System.out.println(k);
//
//
// //       3.YOL
//        int j = 0;
//        String p = "";
//        do {
//            p+="*"+s.charAt(j);
//           j++;
//        }while (j<s.length());
//        System.out.println(p);
//
//

    }



}
