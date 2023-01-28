package yangyunseon.solid.isp;

// 연산 결과만 출력
public class DisplayTypeA  implements DisplayResult{

    @Override
    public void displayResult(AbstractOperation operation, int firstNumber, int secondNumber) {
        int answer = operation.operate(firstNumber, secondNumber);
        System.out.println(answer);
    }

}