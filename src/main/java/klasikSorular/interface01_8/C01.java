package klasikSorular.interface01_8;

public class C01 implements I02,I01 {
    public static void main(String[] args) {
 //       System.out.println(v1);// A) sikki yanlis  Complie Time Eror

        System.out.println(I01.v1);  //B) Sikki Dogru   2000


        System.out.println(str2);// C) sikki yanlis  Complie Time Eror vermez  // Output:Audi

//        System.out.println(I02.str2);//B) Sikki Dogru    Audi
    }

}
