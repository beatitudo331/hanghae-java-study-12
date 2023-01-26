package kimdonghyeon.solid.step1;

public class Client {
    public static void main(String[] args) {
<<<<<<< HEAD
        Calculator calculator = new Calculator();
=======
        Calculator calculator = new Calculator(
                new AddOperation(),
                new SubstractOperation(),
                new MultiplyOperation(),
                new DivideOperation()
        );
>>>>>>> origin/main

        int firNum = 140;
        int secNum = 60;

<<<<<<< HEAD
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

=======
        int answer = calculator.add(firNum, secNum);
        System.out.println(" + answer = " + answer);

        answer = calculator.substract(firNum, secNum);
        System.out.println(" - answer = " + answer);

        answer = calculator.multiply(firNum, secNum);
        System.out.println(" * answer = " + answer);

        answer = calculator.divide(firNum, secNum);
        System.out.println(" / answer = " + answer);
>>>>>>> origin/main
    }
}