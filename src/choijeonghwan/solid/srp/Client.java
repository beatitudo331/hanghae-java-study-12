package solid.srp;
public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(
                new AddOperation(),
                new SubstractOperation(),
                new MultiplyOperation(),
                new DivideOperation()
        );

        int firNum = 140;
        int secNum = 60;

        String operator = "+";
        int answer = calculator.add(firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "-";
        answer = calculator.substract(firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "*";
        answer = calculator.multiply(firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "/";
        answer = calculator.divide(firNum, secNum);
        System.out.println(operator + " answer = " + answer);
    }
}