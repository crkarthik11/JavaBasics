package _23_Using_Generics.src;


import java.util.ArrayList;
import java.util.HashMap;
 
class Animal {
     
}
 
 
public class App {
 
    public static void main(String[] args) {
         
        /////////////////// Before Java 5 ////////////////////////
        ArrayList list = new ArrayList();
         
        list.add("one");
        list.add("two");
        list.add("three");
         
        String res = (String)list.get(1);
         
        System.out.println(res);
         
        /////////////// Modern style //////////////////////////////
         
        ArrayList<String> strings = new ArrayList<String>();
         
        strings.add("cat");
        strings.add("dog");
        strings.add("elephant");
         
        String val = strings.get(1);
         
        System.out.println(val);
         
         
        ///////////// There can be more than one type argument ////////////////////
         
        HashMap<Integer, String> map = new HashMap<Integer, String>();
         
         
        //////////// Java 7 style /////////////////////////////////
         
        ArrayList<Animal> someList = new ArrayList<>();
    }
 
}