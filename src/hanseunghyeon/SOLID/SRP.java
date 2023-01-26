package hanseunghyeon.SOLID;
class AddOperation_1 extends Calculator_1{
    public int calculate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
class SubstractOperation_1 extends Calculator_1{
    public int calculate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
class MultiplyOperation_1 extends Calculator_1{
    public int calculate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
class DivideOperation_1 extends Calculator_1{
        public int calculate(int firstNumber, int secondNumber) {
            if(secondNumber == 0)
                return -99999;
            return firstNumber / secondNumber;
        }
}

class Calculator_1 {
    public int calculate(String operator, int firstNumber, int secondNumber){
        int answer = 0;
        if(operator.equals("+")){
            answer = new AddOperation_1().calculate(firstNumber,secondNumber);
        }else if(operator.equals("-")){
            answer = new SubstractOperation_1().calculate(firstNumber,secondNumber);
        }else if(operator.equals("*")){
            answer = new MultiplyOperation_1().calculate(firstNumber,secondNumber);
        }else if(operator.equals("/")){
            answer = new DivideOperation_1().calculate(firstNumber,secondNumber);
        }
        return answer;
    }
}

class Client_1 {
    public static void main(String[] args) {
        Calculator_1 calculator = new Calculator_1();

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
