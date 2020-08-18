import exception.NonPositiveNumberException;

public class FizzBuzz {
    public String covert(int number) throws NonPositiveNumberException {
        if(isNegativeNum(number)) {
            throw new NonPositiveNumberException();
        }
        if(isMultipleOf3(number) && isMultipleOf5(number)) {
            return "FizzBuzz";
        }
        if(isMultipleOf3(number)) {
            return "Fizz";
        }
        if(isMultipleOf5(number)) {
            return "Buzz";
        }
        return null;
    }

    private boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOf3(int number) {
        return number % 3 == 0;
    }

    private boolean isNegativeNum(int number) {
        return number < 0;
    }
}
