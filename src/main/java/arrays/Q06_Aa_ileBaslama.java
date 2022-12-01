package arrays;

public class Q06_Aa_ileBaslama {
    public static void main(String[] args) {
          /*
    Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz.
String s = "Apex is an object oriented programming language";    */
        String s = "Apex is an object oriented programming language";

        String srr[]=s.toLowerCase().split(" ");
        
        int counter = 0 ;
        
        
        for (String w : srr){
            if(w.startsWith("a")){
                counter++;
            }
            
            
        }
        System.out.println("'A' veya 'a' characteri sayisi = " + counter);
        
        
        
        
        
        

    }

}
