package loops;

public class Q11_TerstenYazma {
    public static void main(String[] args) {
        /*
        Bir String’ i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM           */
 //           1. Yol:
            String t = "Mark";
            String rev = "";
        for (int i = t.length()-1; i >=0 ; i--) {
            String ch = t.substring(i,i+1);
            rev += ch;

        }
        System.out.println(rev);
       // 2.Yol
        int j = t.length()-1;
        while (j<0){
            String ch = t.substring(j,j+1);
            rev+=ch;
            j--;
        }
        System.out.println(rev);







    }
}
