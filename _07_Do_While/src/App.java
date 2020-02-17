package _07_Do_While.src;



import java.util.Scanner;
 
 
public class App {
 
    public static void main(String[] args) {
 
         
        Scanner scanner = new Scanner(System.in);
         
        int value = 0;
        do {
            System.out.println("Enter a number: ");
            value = scanner.nextInt();
        }
        while(value != 1);
         
        System.out.println("You got 1!");
    }
 
}