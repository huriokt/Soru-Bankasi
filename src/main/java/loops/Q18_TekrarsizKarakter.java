package loops;

public class Q18_TekrarsizKarakter {
    public static void main(String[] args) {
/*
Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
Örneğin; Hello ==> Heo                       */

        String str ="Hello";
        String newstr = "";

        for (int i = 0; i < str.length(); i++) {
            String harf = str.substring(i,i+1);
            if(str.indexOf(harf)==str.lastIndexOf(harf)){
                newstr+=harf;

            }
        }
        System.out.println(newstr);








    }
}
