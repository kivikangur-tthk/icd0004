package ee.taltech.icd0004.kkivik;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public static String greet(String name) {
        if (name == null || name.isBlank()) {
            name = "my friend";
        }
        if (name.chars().filter(Character::isLetter).allMatch(Character::isUpperCase)) {
            return "HELLO, " + name + "!";
        }
        return "Hello, " + name + ".";
    }

    public static String greet(String[] names) {
        String name;
        if (names.length > 2) {
            StringBuilder stringBuilder = new StringBuilder();
            int end = names.length - 1;
            for (int i = 0; i < end; i++) {
                stringBuilder.append(names[i] + ", ");
            }
            stringBuilder.append("and " + names[end]);
            name = stringBuilder.toString();
        } else {
            name = String.join(" and ", names);
        }
        return greet(name);
    }
}
