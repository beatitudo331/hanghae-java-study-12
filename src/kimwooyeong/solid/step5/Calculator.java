package kimwooyeong.solid.step5;

public class Calculator {

    public int calculate(AbstractOperation operator, int firstNumber, int secondNumber) {
        return operator.operate(firstNumber,secondNumber);

    }
}

