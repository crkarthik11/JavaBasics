package _19_Interfaces.src;

public class Machine implements IStartable {

    @Override
    public void start() {
        System.out.println("Inside Machine start");

    }

    public void stop() {
        System.out.println("Inside Machine stop");

    }

}