package strinanipulations;

public class AhmetHSorusu {
    public static void main(String[] args) {
/*Kullanicidan bir bir metin ve bir cumle aliniz:
        1-"cumle metni icermiyor"
        2-cumle metni sadece 1 kere iceriyor
       3- cumle metni 1 den fazla iceriyor   */

        String metin = "Zaman kisa ne kadar kisa";
        String cumle = "kisa";

        if (!metin.contains("kisa")) {
            System.out.println("cumle metni icermiyor");
        } else {

            int IlkIndex = metin.indexOf(cumle);
            int ikinciIndex = metin.indexOf(cumle, IlkIndex + 1);//Yoksa Java -1 return eder.
            System.out.println(ikinciIndex);

            if (ikinciIndex!=-1){
                System.out.println("Cumle metni 1 den fazla iceriyor");
            }else {
                System.out.println("Cumlede metin sadece bir kez vardir");
            }

        }

    }
}
