package kimwooyeong.solid.step2;

public class Calculator {
    public int cacluator(AbstractOperation cacluation, int firstNumber, int secondNumber ){
        return cacluation.operate(firstNumber,secondNumber);
    }
}

