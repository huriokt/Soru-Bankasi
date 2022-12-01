package loops;

public class Q29_MethodSayilar {


    public static void main(String[] args) {

      //  Herhangi bir döngü kullanmadan 1'den 100'e kadar tam sayıları yazdıran bir program yazınız.
        sayilar(100);

    }
    public static void sayilar(int a){

            if(a > 0) {
               sayilar(a- 1);
                System.out.print(a+ " ");
            }
            return;
    }


}
