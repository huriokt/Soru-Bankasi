package loops;

public class Q2_TekrarliCharacter {
    public static void main(String[] args) {
     /*   Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
                Örneğin; accessories ´ ces */
        //     1. Yol:
        String s = "accessories";
        String str = "";
//        for (int i = 0; i < s.length(); i++) {
//            String chr = s.substring(i,i+1);
//            if(s.indexOf(chr)!=s.lastIndexOf(chr)){
//                if (!str.contains(chr))
//               str=str+chr;
//            }
//        }
//        System.out.print(str);
        System.out.println();
        //2.YOL
//        int i = 0;
//        while (i < s.length()){
//            String chr = s.substring(i,i+1);
//            if(s.indexOf(chr)!=s.lastIndexOf(chr)){
//                if (!str.contains(chr))
//                    str=str+chr;
//            }
//
//            i++;
//        }
//
//        System.out.println(str);
        System.out.println();

        //3.YOL
        int i = 0;
        do {
            String chr = s.substring(i, i + 1);
            if (s.indexOf(chr) != s.lastIndexOf(chr)) {
                if (!str.contains(chr))
                    str = str + chr;
            }
            i++;

        } while (i < s.length());
        System.out.println(str);

    }
}
