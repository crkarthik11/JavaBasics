package _15_Constructors.src;

class Product {
    private String name;
    private int code;
    public final static String company = "Apple";

    public Product() {
        this("One Plus 6", 10);

        System.out.println("Constructor running!");
    }

    public Product(String name) {
        this(name, 100);

        System.out.println("Name constructor running");

    }

    public Product(String name, int code) {

        System.out.println("Name and code constructor running");
        this.name = name;
        this.code = code;
    }

    void print() {
        System.out.println(this.name + " " + this.code);
    }
}

public class App {
    public static void main(String[] args) {

        System.out.println(Product.company);
        // Product.company = "Google";
        System.out.println(Product.company);

        Product machine1 = new Product();

        // machine1.print();

        // Product machine2 = new Product("Iphone 10");
        // // machine2.print();

        // Product machine3 = new Product("Samsung", 7);
        // machine3.print();

    }

}