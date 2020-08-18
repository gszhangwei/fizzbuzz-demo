import exception.NonPositiveNumberException;

public class FizzBuzz {
    public String covert(int number) throws NonPositiveNumberException {
        if(number < 0) {
            throw new NonPositiveNumberException();
        }
        if(number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if(number % 3 == 0) {
            return "Fizz";
        }
        if(number % 5 == 0) {
            return "Buzz";
        }
        return null;
    }
}
