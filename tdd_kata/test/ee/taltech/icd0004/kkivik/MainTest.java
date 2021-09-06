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
        Assertions.assertEquals("Hello, my friend.", Main.greet(null));
    }
}