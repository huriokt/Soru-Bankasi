package strinanipulations;

import java.util.Scanner;

public class Q12_SonuNokta {
    public static void main(String[] args) {
/*Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod
yazınız.
Örnek: ‘Ali’ için kodunuz konsolda false yazdırmalıdır
‘ali.’ için kodunuz konsolda false yazdırmalıdır
‘ Ali. ’ için kodunuz konsolda false yazdırmalıdır
‘Ali.’ için kodunuz konsolda true yazdırmalıdır
‘ALI.’ için kodunuz konsolda true yazdırmalıdır*/



        String str1 = "Ali";
        String str2 = "ali.";
        String str3 = "Ali. ";
        String str4 = "Ali.";
        String str5 = "ALI.";
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz :");
        String str = input.next();
        char ilkstr = str.charAt(0);
        char son = str.charAt(str.length()-1);
        System.out.println(ilkstr>='A'&&ilkstr<='Z'&&son=='.');













    }
}
