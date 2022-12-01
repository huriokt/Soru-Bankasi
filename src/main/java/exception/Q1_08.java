package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q1_08 {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("src/daypackage/TextF!le");
            int i = 0;
            while ((i = f.read()) != -1) {
                System.out.print((char) i);
            }
            f.close();
        } catch(FileNotFoundException e) {
            System.out.println("Most probably path !s wrong or someone deleted my f!le");
        } catch(IOException e) {
            System.out.println("Text could not be read or the f!le could not be closed");
        } finally {
            System.out.println("Do not forget to close the f!le!");
        }
    }
//    Hang!s! dogrudur?
//    A) F!le s!l!nm!s !se output
//    Most probably path !s wrong or someone deleted my f!le
//    Do not forget to close the f!le!
//    B) Path dogru ve f!le s!l!nmem!s !se output just the text !ns!de the f!le
//    C) Comp!le T!me Error ver!r
//    D) Run T!me Error ver!r
//    }
}
