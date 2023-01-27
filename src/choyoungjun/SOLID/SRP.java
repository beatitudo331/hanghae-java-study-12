package choyoungjun.SOLID;

import static java.lang.System.exit;

public class SRP {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setFirstNumber(140);
        calculator.setSecondNumber(0);


        int answer = calculator.addOperation();
        System.out.println("answer = " + answer);

        answer = calculator.subtractOperation();
        System.out.println("answer = " + answer);

        answer = calculator.multiplyOperation();
        System.out.println("answer = " + answer);

        answer = (int)calculator.divideOperation();
        System.out.println("answer = " + answer);
    }
}
class Calculator {
    private int firstNumber;
    private int secondNumber;
    public Calculator(){
        this.firstNumber = 0;
        this.secondNumber = 0;
    }

    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int addOperation() {
        AddOperation addOperation = new AddOperation(firstNumber,secondNumber);
        return addOperation.operate();
    }
    public int subtractOperation(){
        SubstractOperation substractOperation = new SubstractOperation(firstNumber, secondNumber);
        return substractOperation.operate();
    }

    public int multiplyOperation(){
        MultiplyOperation multiplyOperation = new MultiplyOperation(firstNumber,secondNumber);
        return multiplyOperation.operate();
    }
    public double divideOperation() {
        DivideOperation divideOperation = new DivideOperation(firstNumber, secondNumber);
        return divideOperation.operate();
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
}

class AddOperation{
    private int firstNumber;
    private int secondNumber;

    public AddOperation(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int operate(){
        return firstNumber+secondNumber;
    }
}

class SubstractOperation{
    private int firstNumber;
    private int secondNumber;

    public SubstractOperation(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int operate(){
        return firstNumber-secondNumber;
    }
}

class MultiplyOperation{
    private int firstNumber;
    private int secondNumber;

    public MultiplyOperation(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int operate(){
        return firstNumber*secondNumber;
    }
}

class DivideOperation{
    private int firstNumber;
    private int secondNumber;

    public DivideOperation(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double operate(){
        try{
            return firstNumber/secondNumber;
        } catch(ArithmeticException e){
            System.out.println("0으로 나눌수 없습니다. 다시 계산해주세요");
            exit(0);
        }
        return firstNumber/secondNumber;
    }
}