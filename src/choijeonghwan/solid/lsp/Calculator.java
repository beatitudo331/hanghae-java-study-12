package solid.lsp;

public class Calculator {
    // 연산 기능을 추상화된 부모클래스에 의존하여 처리한다.
    public int calculate(AbstractOperation operation, int firstNumber, int secondNumber) {
        if (operation.isInvalid(firstNumber, secondNumber) == true){
        return operation.operate(firstNumber, secondNumber);}
        else return -999999;
    }
}