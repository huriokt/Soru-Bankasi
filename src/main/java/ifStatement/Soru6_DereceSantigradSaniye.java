package ifStatement;

import java.util.Scanner;

public class Soru6_DereceSantigradSaniye {
    public static void main(String[] args) {

        /*Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için
        kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
        a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz
        "16 km" yazmalıdır (sayı dinamik olacak)
        b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
        kodunuz "2" yazmalıdır (sayı dinamik olacak)
        c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde,
                konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yapmak istediginiz islemi 1-Mili km'ye, 2- saniyeyi saate, 3- fahrenhaytı santigrata seciniz : ");

       int istenenIslem = input.nextInt();
        System.out.println("Donusturulmesini istediginiz degeri giriniz:");
        double donusum = input.nextDouble();


        if (istenenIslem==1){
            System.out.println("Mili km'ye donusumu :" + (donusum*1.609));
        } else if (istenenIslem==2){
            System.out.println("saniyeyi saate donusumu :" + (donusum/60));
        }else if (istenenIslem==3) {
            System.out.println("fahrenhaytı santigrata donusumu :" + (donusum-17));
        }else {
            System.out.println("Gecersiz islem yapamazsiniz");
        }







    }
}
