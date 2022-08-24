import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsTester {

    @BeforeAll
    static void beforeAll(){
        System.out.println("BEFORE ALLLLLL");
    }

    @BeforeEach
    void setUp() {
        System.out.println("RUUNNING BEFORE EACH");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
    @Test
    public void greetingsTest(){
        System.out.println("Testing the hello greeting");
        String actual = new Greetings().sayHello();
        String expected = "Hello";
        assertEquals(expected, actual);
    }

}
