package exception;

public class Q1_06 {
//    public static void main(String[] args) {
//        int arr[] = {9, 8, 7, 6};
//        try {
//            System.out.print("Good");
//            System.out.print(arr[4]);
//        }catch(ArrayIndexOutOfBoundsException e) {
//            System.out.print("Better");
//        }
//    }
    //   Output GoodBetter


//public static void main(String[] args) {
//
//
//        String s2 = null;
//        try{
//            System.out.println(s2.length());
//            System.out.print("Good");
//        }catch(NullPointerException e) {
//            System.out.print("Better");
//        }
//    }
    //  Output GoodBetter YANLIS  dogrusu Better

    public static void main(String[] args) {



    String s = "123";
    System.out.println(s +1); // A
    int num = Integer.parseInt(s);
    System.out.println(num +1); // B
//    A = 1231 ve B = 124
}
  //  public static void main(String[] args) {

//
//    String s2 = "abc";
//try{
//        System.out.println(Integer.parseInt(s2));
//    }catch(NullPointerException e) {
//        System.out.print("Better");
//    }catch(NumberFormatException e) {
//        System.out.print("The Best");
//    }
//}
  //  Output The Best DOGRU



    }


