// must be unique & usually is domain in reverse order
package practice_Code.lesson1;

// imports go here - 1 or more
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



// public class must match file name - Can only have one
public class PersonTest {

    @Test
    public void shouldReturnHelloWorld(){

        Person john = new Person();
        // compare our expectation with result
        assertEquals("Hello World",john.helloWorld() );
        //assertEquals was imported from junit
    }

    @Test
    public void shouldReturnHelloJohn() {
        Person person = new Person();
        assertEquals("Hello john", person.hello("john"));
    }

}
