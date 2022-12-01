package loops;

public class Q03_Palindrom {
    public static void main(String[] args) {


  /*      Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.*/

        String str = "123321";
        String s = "";
//1.YOL
//        for (int i =str.length()-1 ; ; i--) {
//           String ch = str.substring(i,i+1);
//            s=s+ch;
//           if (str.equals(s)){
//               System.out.println("Palindrom");
//           }else {
//               System.out.println("Palindrom degil");
//           }
//        }

        System.out.println();
        //2.YOL
//        int i = str.length()-1;
//        while (i >-1){
//            String ch = str.substring(i,i+1);
//            s=s+ch;
//
//            i--;
//        } if (str.equals(s)){
//            System.out.println("Palindrom");
//        }else {
//            System.out.println("Palindrom degil");
//        }
        System.out.println();

        int i = str.length() - 1;

        String str1 = "";
        do {
            String ch = str.substring(i, i + 1);
            str1 = str1 + ch;
            i--;

        } while (i > -1);
        if (str.equals(str1)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Palindrom degil");
        }


    }
}
