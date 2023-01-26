package parkjaeyong.solid.dip;

import parkjaeyong.solid.isp.AddOperation;

public class Client {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(new AddOperation());

        int firNum = 140;
        int secNum = 60;

        int answer = calculator.calculate(firNum, secNum);
        System.out.println("answer = " + answer);

        calculator.setOperator(new SubstractOperation());
        answer = calculator.calculate(firNum, secNum);
        System.out.println("answer = " + answer);

        calculator.setOperator(new MultiplyOperation());
        answer = calculator.calculate(firNum, secNum);
        System.out.println("answer = " + answer);

        calculator.setOperator(new DivideOperation());
        answer = calculator.calculate(firNum, secNum);
        System.out.println("answer = " + answer);
    }
}
