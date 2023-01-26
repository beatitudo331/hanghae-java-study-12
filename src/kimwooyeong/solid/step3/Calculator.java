package kimwooyeong.solid.step3;

public class Calculator {
    // 연산 기능을 추상화된 부모클래스에 의존하여 처리한다.
    public int calculate(AbstractOperation operation, int firstNumber, int secondNumber) {
        // 나누기 연산 - 0처리 추가
        if(operation.den(secondNumber)){
                return -99999;

        }
        return operation.operate(firstNumber, secondNumber);
    }
}
