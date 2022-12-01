package ifStatement;

import java.util.Scanner;

public class Soru2_SifreKontrol {
    public static void main(String[] args) {
       /* Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
        b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
        c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi 8 haneli olarak giriniz : ");

        String password  = input.next();

        if (password.length()>=8){
            if(!password.contains(" ")){
                System.out.println("Gecerli Sifre");
            }if (password.contains(" ")) {
                System.out.println("Sifrede bosluk karakteri kullanmayiniz.");
            }

        }else {
            System.out.println("Gecersiz Sifre");
        }



    }
}
