package wrapper_classes;

public class soru2 {
    public static void main(String[] args) {
        String sayı1= "103";
        Byte yeniSayı = Byte.decode(sayı1);
        System.out.println(yeniSayı);

        String sayı2 = "2351";
        Short yepYenıSayı = Short.decode(sayı2);


        System.out.println(yepYenıSayı-yeniSayı);



    }
}
