package _24_Handling_exceptions.src.demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

    public static void main(String[] args) {

        File file = new File("test.txt");
        // FileReader fr = new FileReader(file);

        try {

            FileReader fr = new FileReader(file);
            // ..
            // ...
            // ..
        } catch (FileNotFoundException exception) {
            System.err.println(exception);
        } catch (ArithmeticException arithmeticException) {
            System.err.println(arithmeticException);
        }
    }

}