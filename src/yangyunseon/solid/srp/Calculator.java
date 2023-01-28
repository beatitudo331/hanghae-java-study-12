package yangyunseon.solid.srp;

class Calculator {

    int calculate(String operator, int firstNumber, int secondNumber) {
        int answer = 0;

        if (operator.equals("+")) {
            answer = AddOperation.add(firstNumber, secondNumber);
        } else if (operator.equals("-")) {
            answer = SubstractOperation.substract(firstNumber,secondNumber);
        } else if (operator.equals("*")) {
            answer = MultiplyOperation.multiply(firstNumber,secondNumber);
        } else if (operator.equals("/")) {
            answer = DivideOperation.divide(firstNumber,secondNumber);
        }

        return answer;
    }
}

