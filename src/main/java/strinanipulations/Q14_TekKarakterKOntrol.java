package strinanipulations;

public class Q14_TekKarakterKOntrol {
    public static void main(String[] args) {
    /*    Bir String’ in belirli bir tek karaktere sahip olup olmadığını üç farklı şekilde kontrol etmek
        için kod yazınız.*/

//1.YOL
/*        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir String  giriniz :");
        String pwd = input.next();
        System.out.println("Lutfen kontrol etmek istediginiz  bir karakter giriniz :");
        String ch = input.next();
        boolean varMi = pwd.contains(ch);
        System.out.println(varMi);      */
        //2.YOL
 /*       String  s = "kalem";
        boolean sonuc = s.contains("m");
        System.out.println(sonuc);
        */
     //   3.YOL
 /*       String  st = "kalem";
        boolean yokMu= st.length()==st.replaceAll("m","").length();
        System.out.println(yokMu);*/
 //       4.YOL
        String  st = "kalem";
        boolean sonuc = st.indexOf("m")!=-1;
        System.out.println(sonuc);



    }
}
