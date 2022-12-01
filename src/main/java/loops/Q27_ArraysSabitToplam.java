package loops;

public class Q27_ArraysSabitToplam {
    public static void main(String[] args) {
   /*     Belirli bir arrayden, toplamı belirli bir sayı olan tüm çiftleri bulunuz.
         Array {4, 6, 5, -10, 8, 5, 20} ve sayı 10 ise, çıktı 4+6=10, 5+5=10, -10+20=10 olacaktır. */

        int arr[]={4, 6, 5, -10, 8, 5, 20};
        int  sayi =10;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]+arr[j]==sayi){
                    System.out.println(arr[i]+"+"+arr[j]+" = "+sayi);
                }
            }

        }











    }
}
