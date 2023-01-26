package kimdoyeon.solid.lsp;

public class Calculator {

    public int calculate(AbstractOperation operation, int firstNumber, int secondNumber) {
        if (operation.isInvalid(secondNumber))
            return -99999;

        return operation.operate(firstNumber, secondNumber);
    }

}
