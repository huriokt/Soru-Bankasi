package loops;

import java.util.Scanner;

public class s26 {
    public static void main(String[] args) {

     /*   String'de verilen karakterin ilk olduğu index ile son tekrarlandığı index arasındaki karakter
        sayısını sayınız.Boşluk karakterlerini saymayınız.
                Kod, kullanıcının seçtiği karakter String ‘de sadece bir kez varsa konsolda -1,
                Kod, kullanıcının seçtiği karakter String ‘de yoksa konsolda -1 döndürsün.
                Örneğin; "Java is easy" - 'a' ==> 5
        "Java is easy" - 'w' ==> -1
        "Java is easy" - 'e' ==> -1 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir String giriniz :");
        String s = scan.nextLine().replaceAll("\\s", "");

        System.out.println("Bir karakter giriniz :");

        char ch = scan.next().charAt(0);

        int ilk = s.indexOf(ch);
        int son = s.lastIndexOf(ch);
        int fark = son - ilk-1;
        System.out.println(fark);

        int counter = 0;
        if(ilk==son){
            System.out.println(ch+ "==> -1");
        }else {
            for (int i =ilk+1; i < son; i++) {
                if(s.charAt(i)!=' '){
                    counter++;
                }
            }
            System.out.println(ch +"==>"+counter);
        }







    }
}
