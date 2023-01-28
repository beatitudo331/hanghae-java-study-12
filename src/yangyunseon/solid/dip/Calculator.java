package yangyunseon.solid.dip;

public class Calculator  {
    public int calculate(String operator, int firstNumber, int secondNumber) {
        int answer = 0;

        if(operator.equals("+")){
            answer = AddOperation.operate(firstNumber, secondNumber);
        }else if(operator.equals("-")){
            answer = SubstractOperation.operate(firstNumber, secondNumber);
        }else if(operator.equals("*")){
            answer = MultiplyOperation.operate(firstNumber, secondNumber);
        }else if(operator.equals("/")){
            answer = DivideOperation.operate(firstNumber, secondNumber);
        }
        return answer;
    }
}