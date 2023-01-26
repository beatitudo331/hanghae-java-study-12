package yuyeongwoo.solid.lsp;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int firNum = 4;
        int secNum = 2;

        int answer = calculator.calculate(new AddOperation(), firNum, secNum);
        System.out.println(firNum + " + " + secNum + " = " + answer);

        answer = calculator.calculate(new SubtractOperation(), firNum, secNum);
        System.out.println(firNum + " - " + secNum + " = " + answer);

        answer = calculator.calculate(new MultiplyOperation(), firNum, secNum);
        System.out.println(firNum + " * " + secNum + " = " + answer);

        answer = calculator.calculate(new DivideOperation(), firNum, secNum);
        System.out.println(firNum + " / " + secNum + " = " + answer);
    }
}
