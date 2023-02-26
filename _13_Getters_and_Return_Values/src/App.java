package _13_Getters_and_Return_Values.src;

class Person {
    private String name;
    private int age;

    void setName(String tempName) {
        this.name = tempName;
    }

    void setAge(int age) {
        this.age = age;
    }

    void speak() {
        System.out.println("My name is: " + name);
    }

    int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;

        return yearsLeft;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}

public class App {

    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setName("Joe");
        person1.setAge(29);

        int years = person1.calculateYearsToRetirement();

        System.out.println("Years till retirements " + years);
        System.out.println(person1.getName() + person1.getAge());

    }

}