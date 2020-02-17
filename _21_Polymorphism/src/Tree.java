package _21_Polymorphism.src;


public class Tree extends Plant {
 
    @Override
    public void grow() {
        System.out.println("Tree growing");
    }
     
    public void shedLeaves() {
        System.out.println("Leaves shedding.");
    }
     
}