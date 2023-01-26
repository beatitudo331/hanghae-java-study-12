package kimwooyeong.solid.step2;

public class Client {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int firNum = 140;
        int secNum = 60;

        String operator = "+";
        int answer = calculator.cacluator(new AddOperation(), firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "-";
        answer = calculator.cacluator(new SubstractOperation(), firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "*";
        answer = calculator.cacluator(new MultiplyOperation(), firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "/";
        answer = calculator.cacluator(new DivideOperation(), firNum, secNum);
        System.out.println(operator + " answer = " + answer);
    }
}
