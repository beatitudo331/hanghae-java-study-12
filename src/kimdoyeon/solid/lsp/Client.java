package kimdoyeon.solid.lsp;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int firNum = 140;
        int secNum = 0;

        String operator = "+";
        int answer = calculator.calculate(new AddOperation(), firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "-";
        answer = calculator.calculate(new SubstractOperation(), firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "*";
        answer = calculator.calculate(new MultiplyOperation(), firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "/";
        answer = calculator.calculate(new DivideOperation(), firNum, secNum);
        System.out.println(operator + " answer = " + answer);
    }
}

