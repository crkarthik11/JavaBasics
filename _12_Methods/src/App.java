package _12_Methods.src;


class Person {
 
    // Instance variables (data)
    String name;
    int age;
 
    // Classes can contain
 
    // 1. Data
    // 2. methods
     
    void printname() {
        for(int i=0; i<3; i++) {
            System.out.println("My name is: " + name + " and I am " + age + " years old ");
        }
    }
     
    void sayHello() {
        System.out.println("Hello there!");
    }
}
 
public class App {
 
    public static void main(String[] args) {
 
        // Create a Person object using the Person class
        Person person1 = new Person();
        person1.name = "Jon Snow";
        person1.age = 37;
        person1.printname();
        person1.sayHello();
 
        // Create a second Person object
        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;
        person2.sayHello();
        person1.sayHello();
 
        System.out.println(person2.name);
 
    }
 
}