import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {
    public static void main(String[] args) {
        Person tom = new Person();
        tom.displayInfo();

        Person al = new Person("tomos");
        tom.displayInfo();

        Person sam = new Person("Sam", 25); // вызов третьего конструктора с двумя параметрами
        sam.displayInfo();


    }

    static class Person {

        String name;
        int age;
        Person()
        {
            this("Undefined", 10);
        }
        Person(String name)
        {
            this(name, 18);
        }

        Person(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
           void displayInfo(){
                System.out.println(name+' '+age);
            }
        }
}







































