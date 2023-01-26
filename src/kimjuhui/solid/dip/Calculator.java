package kimjuhui.solid.dip;

public class Calculator {
    private AbstractOperation abstractOperation;
    public int calculate(String operator, int firstNumber, int secondNumber) {

        if(operator.equals("+")){
            abstractOperation = new AddOperation();
        }else if(operator.equals("-")){
            abstractOperation = new SubstractOperation();
        }else if(operator.equals("*")){
            abstractOperation = new MultiplyOperation();
        }else if(operator.equals("/")){
            abstractOperation = new DivideOperation();
        }
        return abstractOperation.operate(firstNumber, secondNumber);
    }
}