package kyungyeon.report9.solid.srp;

//    원칙 적용 방법
//        더하기, 빼기, 곱하기, 나누기 연산을 기능별로 연산 클래스를 구현합니다.
//        계산기 클래스는 계산을 진행할 때 연산 클래스들을 이용합니다.
//        AddOperation : +
//            operate : 메서드
//        SubstractOperation : -
//            operate : 메서드
//        MultiplyOperation : *
//            operate : 메서드
//        DivideOperation : /
//            operate : 메서드

class Calculator {

    public int calculate(String operator, int firstNumber, int secondNumber) {
        switch (operator) {
            case "+":
                AddOperation add = new AddOperation();
                return add.operate(firstNumber, secondNumber);
            case "-":
                SubstractOperation sub = new SubstractOperation();
                return sub.operate(firstNumber, secondNumber);
            case "*":
                MultiplyOperation multi = new MultiplyOperation();
                return multi.operate(firstNumber, secondNumber);
            case "/":
                DivideOperation divide = new DivideOperation();
                return divide.operate(firstNumber, secondNumber);
            default:
                return -999999;
        }
    }
}

class AddOperation {
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}

class SubstractOperation {
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}

class MultiplyOperation {
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}

class DivideOperation {
    public int operate(int firstNumber, int secondNumber) {
        if(secondNumber == 0){
            return -999999;
        }
        return firstNumber / secondNumber;
    }
}


class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

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
