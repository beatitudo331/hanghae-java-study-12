package hwj_report;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        while (true) {

            // 계산기 왜 프로그래밍 언어에 제어문
            Scanner scanner = new Scanner(System.in);
            // 숫자 2개랑, 연산기호

            System.out.print("숫자 1 입력하세요 : ");
            int num1 = scanner.nextInt();
            System.out.print("연산자를 입력하세요 : ");
            String op = scanner.next();
            System.out.print("숫자 2 입력하세요 : ");
            int num2 = scanner.nextInt();


            if (op.equals("*")) {
                System.out.println(num1 * num2);
            } else if (op.equals("/")) { // 분모 : num2 != 0
                if (num2 > 0) {
                    System.out.println(num1 / num2);
                } else if (num2 == 0) {
                    System.out.println("다시 입력하세요!");
                } else {
                    System.out.println("음수값이 나옵니다.");
                    System.out.println(num1 / num2);
                }
            } else if (op.equals("+")) {
                System.out.println(num1 + num2);
            } else if (op.equals("-")) {
                System.out.println(num1 - num2);
            }

            if (op.equals("exit")) {
                System.out.println("종료!");
                //break;
                return;
            }

            // switch
//            switch (op) {
//                case "*":
//                    System.out.println(num1 * num2);
//                    break;
//                case "/":
//                    if (num2 > 0) {
//                        System.out.println(num1 / num2);
//                    } else {
//                        System.out.println("다시 입력하세요!");
//                    }
//                    break;
//                case "+":
//                    System.out.println(num1 + num2);
//                    break;
//                case "-":
//                    System.out.println(num1 - num2);
//                    break;
//                default:
//                    System.out.println("연산자가 틀렸습니다.");
        }


    }

}






