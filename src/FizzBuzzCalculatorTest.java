import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzCalculatorTest {

    private FizzBuzzCalculator fizzBuzz;

    @Before
    public void setup() {
        fizzBuzz = new FizzBuzzCalculator();
    }

    @Test
    public void whenNumberIsMultipleOfThreeShouldReturnFizz() {
        assertEquals("Fizz", fizzBuzz.calculate(3));
        assertEquals("Fizz", fizzBuzz.calculate(9));
    }

    @Test
    public void whenNumberIsMultipleOfFiveShouldReturnBuzz() {
        assertEquals("Buzz", fizzBuzz.calculate(5));
        assertEquals("Buzz", fizzBuzz.calculate(10));
    }

    @Test
    public void whenNumberIsMultipleOfThreeAndFiveShouldReturnFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.calculate(15));
    }

    @Test
    public void whenNumberNotIsMultipleOfThreeOrFiveShouldReturnTheNumber() {
        assertEquals("1", fizzBuzz.calculate(1));
        assertEquals("34", fizzBuzz.calculate(34));
        assertEquals("7", fizzBuzz.calculate(7));
    }
}
