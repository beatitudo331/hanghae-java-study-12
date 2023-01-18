package kimNahyun.solid.step5;

public class Calculator {
    public int calculate(String operator, int firstNumber, int secondNumber) {
        int answer = 0;

        if(operator.equals("+")){
            answer = firstNumber + secondNumber;
        }else if(operator.equals("-")){
            answer = firstNumber - secondNumber;
        }else if(operator.equals("*")){
            answer = firstNumber * secondNumber;
        }else if(operator.equals("/")){
            answer = firstNumber / secondNumber;
        }

        return answer;
    }
}
