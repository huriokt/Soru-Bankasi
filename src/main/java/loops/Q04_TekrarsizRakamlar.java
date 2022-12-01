package loops;

public class Q04_TekrarsizRakamlar {
    public static void main(String[] args) {


    /*    Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        Örnek; 223878 ´ 37                                                                       */

        String str = "223878";
        String str1 = "";
//        for (int i = 0; i <str.length() ; i++) {
//
//            String c = str.substring(i,i+1);
//            int ilkIndex = str.indexOf(c);
//            int sonIndex = str.lastIndexOf(c);
//            if (ilkIndex==sonIndex){
//                str1=str1+c;
//
//            }
//        }
//        System.out.println(str1);
        System.out.println();

        //2.YOL

//        int i = 0;
//
//        while (i < str.length()) {
//            String c = str.substring(i, i + 1);
//            int ilkIndex = str.indexOf(c);
//            int sonIndex = str.lastIndexOf(c);
//            if (ilkIndex == sonIndex) {
//                str1 = str1 + c;
//
//            }
//            i++;
//
//        }
//        System.out.println(str1);
        //3.YOL
        int i = 0;
        do {
            String c = str.substring(i, i + 1);
            int ilkIndex = str.indexOf(c);
            int sonIndex = str.lastIndexOf(c);
            if (ilkIndex == sonIndex) {
                str1 = str1 + c;}
            i++;
        } while (i < str.length());
        System.out.println(str1);


    }
}
