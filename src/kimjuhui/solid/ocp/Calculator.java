package kimjuhui.solid.ocp;

public class Calculator {
    public int calculate(AbstractOperation operator, int firstNumber, int secondNumber) {
        return operator.operate(firstNumber, secondNumber);
    }

}
