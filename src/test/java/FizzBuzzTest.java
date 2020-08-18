import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_fizz_when_number_is_multiple_of_3() {
        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.covert(number), is("Fizz"));
    }

    @Test
    public void should_return_buzz_when_number_is_multiple_of_5() {
        int number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.covert(number), is("Buzz"));
    }
}
