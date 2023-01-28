package yangyunseon.solid.srp;

public class Client {
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
