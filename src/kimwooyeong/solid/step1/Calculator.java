package kimwooyeong.solid.step1;

public class Calculator {
    private AddOperation addOperation;
    private SubstractOperation substractOperation;
    private MultiplyOperation multiplyOperation;
    private DivideOperation divideOperation;

    public Calculator(AddOperation addOperation, SubstractOperation substractOperation, MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
        this.addOperation = addOperation;
        this.substractOperation = substractOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }

    public int calculate(String operator, int firstNumber, int secondNumber) {
        int answer = 0;

        if(operator.equals("+")){
            answer = addOperation.operate(firstNumber, secondNumber);
        }else if(operator.equals("-")){
            answer = substractOperation.operate(firstNumber, secondNumber);
        }else if(operator.equals("*")){
            answer = multiplyOperation.operate(firstNumber, secondNumber);
        }else if(operator.equals("/")){
            answer = divideOperation.operate(firstNumber, secondNumber);
        }

        return answer;
    }
}