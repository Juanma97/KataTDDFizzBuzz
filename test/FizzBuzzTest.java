import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void check100FirstNumbers() {
        FizzBuzz fizzBuzz = new FizzBuzz(100);

        fizzBuzz.generate();
    }
}
