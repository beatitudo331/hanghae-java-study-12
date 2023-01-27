package LeeJaeHun.solid.srp;

public class Calculator {

    abstract class Calculate{
        abstract public int operate(int firstNumber, int secondNumber);

    }
    class AddOperation extends Calculate{
        @Override
        public int operate(int firstNumber, int secondNumber) {
            return firstNumber+secondNumber;
        }
    }
    class SubstractOperation extends Calculate{
        @Override
        public int operate(int firstNumber, int secondNumber) {
            return firstNumber-secondNumber;
        }
    }
    class MultiplyOperation  extends Calculate{
        @Override
        public int operate(int firstNumber, int secondNumber) {
            return firstNumber*secondNumber;
        }
    }
    class DivideOperation extends Calculate{
        @Override
        public int operate(int firstNumber, int secondNumber) {
            return firstNumber/secondNumber;
        }
    }



    public int calculate(String operator, int firstNumber, int secondNumber) {
        int answer = 0;
        Calculate operate =null;
        if (operator.equals("+")) {
            operate = new AddOperation();
        } else if (operator.equals("-")) {
            operate = new SubstractOperation();
        } else if (operator.equals("*")) {
            operate = new MultiplyOperation();
        } else if (operator.equals("/")) {
            operate = new DivideOperation();
        }
        answer = operate.operate(firstNumber, secondNumber);

        return answer;
    }



}
