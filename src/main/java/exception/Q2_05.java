package exception;

public class Q2_05 {
    public static void main(String[] args) {
        Integer z = 0;
        try {
            String s = "abcd";
            z = Integer.parseInt(s);
        }catch(NumberFormatException e) {
            System.out.println("Good");
        }
        System.out.println(z);
    }
 //   Run T!me Except!on ver!r  ///Outpu ==> Good 0

    }

