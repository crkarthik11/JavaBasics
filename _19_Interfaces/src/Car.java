package _19_Interfaces.src;

public class Car implements IStartable {
    @Override
    public void start() {
        System.out.println("Inside Car start");

    }

    public void stop() {
        System.out.println("Inside Car stop");

    }
}
