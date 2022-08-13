public class Factorial {
    public int findFactorial(int number) throws negativeNumberException{
        if(number<0)
        {
            throw new negativeNumberException();
        }
        if(number == 1 || number == 0)
            return 1;
        return number*findFactorial(number-1);
    }
}
