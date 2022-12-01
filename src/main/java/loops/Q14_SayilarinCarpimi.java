package loops;

public class Q14_SayilarinCarpimi {
    public static void main(String[] args) {
        /*
    3 ile 9 arasındaki tam sayıların çarpımını bulmak için kodu yazınız. */

        int carp = 1;
        for (int i = 3; i < 9; i++) {
            carp*=i;

        }
        System.out.println(carp);
    }



}
