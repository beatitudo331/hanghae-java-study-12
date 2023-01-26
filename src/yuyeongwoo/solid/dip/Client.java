package yuyeongwoo.solid.dip;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int firstNumber = 4;
        int secondNumber = 2;

        int answer = calculator.calculate(new AddOperation(), firstNumber, secondNumber);
        System.out.println(firstNumber + " + " + secondNumber + " = " + answer);

        answer = calculator.calculate(new SubtractOperation(), firstNumber, secondNumber);
        System.out.println(firstNumber + " - " + secondNumber + " = " + answer);

        answer = calculator.calculate(new MultiplyOperation(), firstNumber, secondNumber);
        System.out.println(firstNumber + " * " + secondNumber + " = " + answer);

        answer = calculator.calculate(new DivideOperation(), firstNumber, secondNumber);
        System.out.println(firstNumber + " / " + secondNumber + " = " + answer);
    }
}
