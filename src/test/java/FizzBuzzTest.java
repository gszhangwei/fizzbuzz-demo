import exception.NonPositiveNumberException;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_fizz_when_number_is_multiple_of_3() throws NonPositiveNumberException {
        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.covert(number), is("Fizz"));
    }

    @Test
    public void should_return_buzz_when_number_is_multiple_of_5() throws NonPositiveNumberException {
        int number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.covert(number), is("Buzz"));
    }

    @Test
    public void should_return_fizz_buzz_when_number_is_multiple_of_3_and_5() throws NonPositiveNumberException {
        int number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.covert(number), is("FizzBuzz"));
    }

    @Test
    public void should_return_same_number_when_number_is_not_multiple_of_3_or_5() throws NonPositiveNumberException {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.covert(2), is("2"));
    }

    @Test(expected = NonPositiveNumberException.class)
    public void should_threw_exception_when_number_is_negative() throws NonPositiveNumberException {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.covert(-1);
    }
}
