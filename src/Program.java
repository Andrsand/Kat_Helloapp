import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {
    public static void main(String[] args) {

        System.out.println(isGmailOrOutlook("@outlook.com"));
    }
    // An example of working with regular expressions of the Pattern and Matcher methods
    public static boolean isGmailOrOutlook(String email) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]+@(gmail|outlook).com$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}





































