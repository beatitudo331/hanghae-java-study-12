package parkjaeyong.solid.isp;

// 연산 결과만 출력
public class DisplayTypeA extends Calculator implements DisplayResult {

    @Override
    public void displayResult(AbstractOperation operation, int firstNumber, int secondNumber) {
        if(!operation.isInvalid(firstNumber,secondNumber)){
            System.out.println("연산 시 유효하지 않은 값 입력!!");
            return;
        }
        int answer = operation.operate(firstNumber, secondNumber);
        System.out.println(answer);
    }

}