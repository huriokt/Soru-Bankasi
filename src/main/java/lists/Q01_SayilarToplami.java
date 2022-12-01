package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01_SayilarToplami {
    public static void main(String[] args) {
        //Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.

        List<Integer> lst = new ArrayList<>(Arrays.asList(12,31,7,13,10));

        int sum =0 ;

        for (Integer w : lst){
            sum += w;
        }
        System.out.println(sum);


    }
}
