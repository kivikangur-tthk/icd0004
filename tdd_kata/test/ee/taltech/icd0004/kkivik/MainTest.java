package ee.taltech.icd0004.kkivik;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
    }

    @Test
    void greeting_bob() {
        Assertions.assertEquals("Hello, Bob.", Main.greet("Bob"));
    }

    @Test
    void greeting_null() {
        Assertions.assertEquals("Hello, my friend.", Main.greet((String) null));
    }

    @Test
    void greeting_emptyString() {
        Assertions.assertEquals("Hello, my friend.", Main.greet(""));
    }

    @Test
    void greeting_whitespaceString() {
        Assertions.assertEquals("Hello, my friend.", Main.greet("\t"));
    }

    @Test
    void greeting_shouting() {
        Assertions.assertEquals("HELLO, JERRY!", Main.greet("JERRY"));
    }

    @Test
    void greeting_twoNames() {
        String[] names = {"Jill", "Jane"};
        Assertions.assertEquals("Hello, Jill and Jane.", Main.greet(names));
    }

    @Test
    void greeting_multipleNames() {
        String[] names = {"Amy", "Brian", "Charlotte"};
        Assertions.assertEquals("Hello, Amy, Brian, and Charlotte.", Main.greet(names));
    }

    @Test
    void greeting_multipleNamesWithOneShouting() {
        String[] names = {"Amy", "BRIAN", "Charlotte"};
        Assertions.assertEquals("Hello, Amy and Charlotte. AND HELLO, BRIAN!", Main.greet(names));
    }

    @Test
    void greeting_multipleNamesWithTwoShouting() {
        String[] names = {"Amy", "BRIAN", "Charlotte", "Jill", "JANE"};
        Assertions.assertEquals("Hello, Amy, Charlotte, and Jill. AND HELLO, BRIAN AND JANE!", Main.greet(names));
    }

    @Test
    void greeting_multipleNamesWithThreeShouting() {
        String[] names = {"AMY", "BRIAN", "Charlotte", "Jill", "JANE"};
        Assertions.assertEquals("Hello, Charlotte, and Jill. AND HELLO, AMY, BRIAN, AND JANE!", Main.greet(names));

    }

    @Test
    void greeting_multipleNamesOnlyShouting() {
        String[] names = {"AMY", "BRIAN", "JANE"};
        Assertions.assertEquals("HELLO, AMY, BRIAN, AND JANE!", Main.greet(names));
    }
}