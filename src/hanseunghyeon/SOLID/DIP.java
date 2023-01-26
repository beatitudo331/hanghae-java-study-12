package hanseunghyeon.SOLID;

class Client_4 {
    public static void main(String[] args) {
        Calculator_4 calculator = new Calculator_4();

        int firNum = 140;
        int secNum = 60;

        String operator = "+";
        int answer = calculator.calculate(operator, firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "-";
        answer = calculator.calculate(operator, firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "*";
        answer = calculator.calculate(operator, firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "/";
        answer = calculator.calculate(operator, firNum, secNum);
        System.out.println(operator + " answer = " + answer);
    }
}

class Calculator_4 {
    public int calculate(String operator, int firstNumber, int secondNumber) {
        return new CheckOperator().checkOperator(operator).operate(firstNumber, secondNumber);
    }
}

class CheckOperator {   // 부호를 입력(String) 받고 부호에 맞는 객체를 리턴
    AbstractOperation_4 checkOperator(String operator) {
        if (operator.equals("+")) {
            return new AddOperation_4();
        } else if (operator.equals("-")) {
            return new SubstractOperation_4();
        } else if (operator.equals("*")) {
            return new MultiplyOperation_4();
        } else{
            return new DivideOperation_4();
        }
    }
}

abstract class AbstractOperation_4 {
    abstract public int operate(int firstNumber, int secondNumber);
}

class AddOperation_4 extends AbstractOperation_4 {
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}

class SubstractOperation_4 extends AbstractOperation_4 {
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}

class MultiplyOperation_4 extends AbstractOperation_4 {
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}

class DivideOperation_4 extends AbstractOperation_4 {
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;

    }
}