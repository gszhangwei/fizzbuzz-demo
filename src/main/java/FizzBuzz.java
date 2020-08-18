import exception.NonPositiveNumberException;

public class FizzBuzz {
    public String covert(int number) throws NonPositiveNumberException {
        if(isNegativeNum(number)) {
            throw new NonPositiveNumberException();
        }
        return buildFizzBuzz(number);
    }

    private String buildFizzBuzz(int number) {
        String result = "";
        if(isMultipleOf3(number)) {
            result += "Fizz";
        }
        if(isMultipleOf5(number)) {
            result += "Buzz";
        }
        if(result.isEmpty()) {
            result += number;
        }
        return result;
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
