package ee.taltech.icd0004.kkivik;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public static String greet(String name) {
        if (name == null || name.isBlank()) {
            name = "my friend";
        }
        return "Hello, " + name + ".";
    }
}
