package strinanipulations;

import java.util.Scanner;

public class Q13_SifreKontrol {
    public static void main(String[] args) {

/*
Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir. Şifrede en az 1
sembol olmalıdır.
Örnek: 'A2b!' için kodunuz konsolda false yazdırmalıdır.
'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
'!1a23b4' için kodunuz konsolda false yazdırmalıdır.
'!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
'! a b 3 k' kodunuz konsolda false yazdırmalıdır.

 */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz :");
        String pwd = input.next();
        boolean a = pwd.replaceAll("\\s","").length()>8;
        boolean b = pwd.replaceAll("[^\\p{Punct}]","").length()>0;
        System.out.println(a&&b);














    }
}
