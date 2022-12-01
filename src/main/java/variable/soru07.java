package variable;

import java.util.Scanner;

public class soru07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("2 sayı giriniz:");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        System.out.println("Degiştirmeden önce:" +n1+"-"+n2);

        // 2.YOL
        double temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("Değistirdikten sonra: " + n1+"-"+n2);

        //3.YOL

        n1 = n1+n2;
        n2= n1-n2;
        n1= n1-n2;
        System.out.println("Değistirdikten sonra: " + n1+"-"+n2);

    }
}
