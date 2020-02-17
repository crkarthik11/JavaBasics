package _15_Constructors.src;


class Product {
    private String name;
    private int code;
     
    public Product() {
        this("One Plus 6", 10);
         
        System.out.println("Constructor running!");
    }
     
    public Product(String name) {
        this(name, 0);
         
        System.out.println("Name constructor running");

    }
     
    public Product(String name, int code) {
         
        System.out.println("Name and code constructor running");
        this.name = name;
        this.code = code;
    }
}
 
public class App {
    public static void main(String[] args) {
        Product machine1 = new Product();

        Product machine2 = new Product("Iphone 10");

        Product machine3 = new Product("Samsung", 7);
    }
 
}