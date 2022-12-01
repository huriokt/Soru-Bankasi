package strinanipulations;

public class Q10_SpaceKontrol {
    public static void main(String[] args) {

/*          Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
            olmadığını kontrol etmek için kod yazınız.
            Örnek: ‘Ali   Can’ için konsolda false yazmalıdır.
            ‘ Ali Can ’ için konsolda false yazmalıdır.
            ‘ Ali Can ’ için konsolda false yazmalıdır.
            ‘Ali Can’ için konsolda true yazmalıdır.                                          */



        String ccc = "Ali Can  ";
        String trm =ccc.trim();

        int cml =trm.length();
        System.out.println(cml);

        String newcumle = trm.replaceAll("\\s","");
        System.out.println(newcumle.length());

        boolean tekBosluk = trm.length()-newcumle.length()==1;
        System.out.println(tekBosluk);












    }
}
