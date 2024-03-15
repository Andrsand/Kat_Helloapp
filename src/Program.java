import java.math.BigInteger;

public class Program {
    public static void main(String[] args) {
        System.out.println(checkWeekend("Saturday"));

    }

    public static String checkWeekend(String weekday) {
        String question = weekday;
        String answer = "";
        return question == "Saturday" || question == "Sunday" ? answer = "Ура, выходной!" : "Надо еще поработать";
    }

}







