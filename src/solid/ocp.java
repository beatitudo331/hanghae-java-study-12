package solid;

public class ocp {
    class Client {
        public static void main(String[] args) {

            Calculator calculator = new Calculator();

            int firNum = 140;
            int secNum = 60;
   //abstactoperation 초기화를 하지 않는다
            int answer = calculator.calculate(new AddOperation(), firNum, secNum);
            System.out.println(" + answer = " + answer);

            answer = calculator.calculate(new SubstractOperation(), firNum, secNum);
            System.out.println(" - answer = " + answer);

            answer = calculator.calculate(new MultiplyOperation(), firNum, secNum);
            System.out.println(" * answer = " + answer);

            answer = calculator.calculate(new DivideOperation(), firNum, secNum);
            System.out.println(" / answer = " + answer);
        }
    }
    class Calculator {
        // 연산 기능을 추상화된 부모클래스에 의존하여 처리한다. 여기 클래스에서 계산할 수 있도록 함
        public int calculate(AbstractOperation operation, int firstNumber, int secondNumber) {
            // 나누기 연산 - 0처리 추가,  상속시킨 operation들이 다양하더라도 부모클래스를 매개변수로 두기
            if(operation instanceof DivideOperation){ //client에서 실행할 때
                if(secondNumber == 0){ //매개변수 자리에 상속된 하위클래스 넣으면 끝
                    return -99999;
                }
            }
            return operation.operate(firstNumber, secondNumber);
        }
    }
    abstract class AbstractOperation { //추상화된 부모클래스, 매개변수 받는 거만 선언해놓기
        public abstract int operate(int firstNumber, int secondNumber); //abstract class
    } //public abstract int 까지만 접근 제한자 선언
    class AddOperation extends AbstractOperation { //extends를 통해 고정시킨 operation을 상속
        @Override    //변화될 부분들을 부모클래스(operation) 만들고 하위 사칙연산을 상속시켜 구체화
        public int operate(int firstNumber, int secondNumber) {
            return firstNumber + secondNumber;
        }
    }

    class MultiplyOperation extends AbstractOperation {
        @Override
        public int operate(int firstNumber, int secondNumber) {
            return firstNumber * secondNumber;
        }
    }
    class DivideOperation extends AbstractOperation {
        @Override
        public int operate(int firstNumber, int secondNumber) {
            return firstNumber / secondNumber;
        }
    }
    class SubstractOperation extends AbstractOperation {
        @Override
        public int operate(int firstNumber, int secondNumber) {
            return firstNumber - secondNumber;
        }
    }

}
