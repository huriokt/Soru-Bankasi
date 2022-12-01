package loops;

public class Q09_CharacterYerineYildizKoyma {
    public static void main(String[] args) {

        /*
        String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
            Örneğin; 'Ali Can?' ==> l*i*a*n*
         */

        String str="Ali Can?";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>='a'&&ch<='z'){
               str= str.replace(ch,'*');
            }

        }
        System.out.println(str);

        System.out.println("************");
        int i = 0;
        while (i<str.length()){
            char ch = str.charAt(i);
            if (ch>='a'&&ch<='z'){

            str= str.replace(ch,'*');

            }
           i++ ;
        }
        System.out.println(str);

        System.out.println("**********");

        int j = 1 ;
        do {
            char ch = str.charAt(j);
            if (ch>='a'&&ch<='z'){
                str= str.replace(ch,'*');

            }
            j++;
        }while (j<str.length());
        System.out.println(str);
//FarkliYol
        /*1. Yol:
String s = "Ali Can?";
s = s.replaceAll("[^a-z]", "");
String t = "";
for(Integer i=0; i<s.length(); i++){
String r = s.substring(i,i+1);
t = t + r + '*';
}
System.out.println(t);

         */















































    }
}
