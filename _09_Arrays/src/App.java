package _09_Arrays.src;

public class App {
    public static void main(String[] args) {

        Integer value = 256;

        int[] values;
        values = new int[3];
        // 0,1,2 = 0,0,0
        System.out.println(values[2]);

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        // System.out.println(values[0]);
        // System.out.println(values[1]);
        // System.out.println(values[2]);

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        // int[] numbers = { 5, 6, 7 };

        // for (int i = 0; i < numbers.length; i++) {
        // System.out.println(numbers[i]);
        // }
    }

}