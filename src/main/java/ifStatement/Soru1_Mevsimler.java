package ifStatement;

import java.util.Scanner;

public class Soru1_Mevsimler {
    public static void main(String[] args) {
        /*Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Aralık, Ocak, Şubat için "Kış"
b) Mart, Nisan, Mayıs için "İlkbahar"
c) Haziran, Temmuz, Ağustos için "Yaz"
d) Eylül, Ekim, Kasım için "Sonbahar"
e) Diğerleri için "Geçersiz ay adı"*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir ay ismi giriniz : ");

        String ay  = input.next().toUpperCase();

        if(ay.equalsIgnoreCase("aralik")||ay.equalsIgnoreCase("Ocak")||ay.equalsIgnoreCase("Subat")){
            System.out.println("Kis");
        }else if(ay.equalsIgnoreCase("mart")||ay.equalsIgnoreCase("nisan")||ay.equalsIgnoreCase("mayis")){
            System.out.println("Ilkbahar");
        }else if(ay.equalsIgnoreCase("haziran")||ay.equalsIgnoreCase("temmuz")||ay.equalsIgnoreCase("agustos")){
            System.out.println("Yaz");
        }else if(ay.equalsIgnoreCase("eylul")||ay.equalsIgnoreCase("ekim")||ay.equalsIgnoreCase("kasim")){
            System.out.println("Sonbahar");
        }else {
            System.out.println("Lutfen gecerli bir ay ismi giriniz :");
        }




    }
}
