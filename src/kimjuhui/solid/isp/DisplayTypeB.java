package kimjuhui.solid.isp;

// 연산 과정을 포함한 출력
public class DisplayTypeB extends Calculator implements DisplayWithOperator {

    @Override
    public void displayResultWithOperator(AbstractOperation operation, int firstNumber, int secondNumber) {
        int answer = operation.operate(firstNumber, secondNumber);
        String operator = operation.getOperator();
        System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + answer);
    }
}

