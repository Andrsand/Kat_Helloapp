public class Program {
    public static void main (String[]args){
        String[] roles = {"Вася", "Петя"};
        String[] textLines = {"Вася: Привет!", "Петя: Пока."};
        System.out.println(textScript(roles, textLines));
    }
    // An example of how StringBuilder works. Distribution of text by roles.
    public static String textScript(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        for (String role : roles) {
            result.append(role).append(":\n");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(role + ":")) {
                    result.append(j + 1).append(") ").append(textLines[j].substring(role.length() + 2)).append("\n");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }
}





































