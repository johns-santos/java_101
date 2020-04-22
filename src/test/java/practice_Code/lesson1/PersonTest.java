// must be unique & usually is domain in reverse order
package practice_Code.lesson1;

// imports go here - 1 or more
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


// public class must match file name - Can only have one
public class PersonTest {

    @Test
    public void shouldReturnHelloWorld() {
        Person john = new Person();
        // compare our expectation with result
        assertEquals("Hello World", john.helloWorld());
        //assertEquals was imported from junit
    }

    @Test
    public void shouldReturnHelloJohn() {
        Person person = new Person();
        assertEquals("Hello john", person.hello("john"));
    }

    @Test
    public void shouldReturnNumberOfPersons() {
        Person person1;
        for (int i = 0; i < 4; i++) {
           person1 = new Person();
        }
            assertEquals(4, Person.numberOfPersons());
        }

    @Test
    public void demonstrateBoolean() {
        boolean monday = false;
        boolean raining = true;
        boolean tuesday = true;
        boolean sunny = true;
        boolean friday = true;

//        if (monday) {
//            drinkBeer();
//        } else if (friday) {
//            drinkWater();
//        } else if (sunny) {
//            goSwimming();
//        } else {
//            drinkMilk();
//        }
//=================== example 2====================
//        int i = 4;
//        int j = 3;
//        boolean areEqual = i == j;
//
//        if (i > j) {
//            executeMethod1();
//        } else if (j > i) {
//            executeMethod2();
//        } else if (areEqual) {
//            executeMethod3();
//        } else {
//            executeMethod4();
    }
        }
















