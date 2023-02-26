package _19_Interfaces.src;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Machine mach1 = new Machine();

        Machine mach2 = new Machine();

        Machine mach3 = new Machine();

        List<Machine> mList = new ArrayList<>();
        mList.add(mach1);
        mList.add(mach2);
        mList.add(mach3);

        for (Machine machine : mList) {
            machine.start();

        }

        System.out.println(mList);

        // Person person1 = new Person("Jamie");
        // person1.greet();

        // Info info1 = new Machine();
        // info1.showInfo();

        // Info info2 = person1;
        // info2.showInfo();

        // System.out.println();

        // outputInfo(mach1);
        // outputInfo(person1);
    }

    private static void outputInfo(Info info) {
        info.showInfo();
    }

}