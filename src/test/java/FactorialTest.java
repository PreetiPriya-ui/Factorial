import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    void negativeNumbersShouldRaiseException()  throws negativeNumberException{
        Factorial factorial = new Factorial();
        Assertions.assertThrows(negativeNumberException.class, () -> factorial.findFactorial(-8));
    }

    @Test
    void factorialOfOneShouldBeOne() throws negativeNumberException{
        Factorial factorial = new Factorial();
        int result = factorial.findFactorial(1);
        Assertions.assertEquals(1,result);
    }

    @Test
    void factorialOfZeroShouldBeOne() throws negativeNumberException{
        Factorial factorial = new Factorial();
        int result = factorial.findFactorial(0);
        Assertions.assertEquals(1,result);
    }

    @Test
    void factorialForOtherPositiveNumbers() throws negativeNumberException{
        Factorial factorial = new Factorial();
        int result = factorial.findFactorial(5);
        Assertions.assertEquals(120,result);
    }
}
