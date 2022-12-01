package loops;

public class Q21_TekrasizSayiTop {
    public static void main(String[] args) {
        /*
        Bir tamsayının benzersiz(tekrarsız) basamaklarının toplamını bulmak için kodu yazınız.
Örnek:12133455 ´ 2+4=6                                  */

//        int p = 12133455;
//        String r = String.valueOf(p);
//        String s = "";
//        int top = 0;
//        for (int i = 0; i < r.length(); i++) {
//            String ch = r.substring(i, i + 1);
//            if (r.indexOf(ch) == r.lastIndexOf(ch)) {
//                s += ch;
//            }
//        }
//            Integer st = Integer.valueOf(s);
//            for (int j = st; j >0; j/=10) {
//
//                top += j%10;
//        }
//        System.out.println("top = " + top);
            //2.YOL
        System.out.println();
        int a = 1213455;
        String str = String.valueOf(a);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            String ch = str.substring(i, i + 1);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                sum += Integer.valueOf(ch);
            }

        }
        System.out.println(sum);



        }
    }
