package solid;

public class srp {
    class Client {
        public static void main(String[] args) { // calculator 인스턴스 생성해도
            Calculator calculator = new Calculator(  //매개변수로 받아올 것들도 클래스니깐
                    new AddOperation(),              // 사칙연산 인스턴스를 초기화 시켜준다
                    new SubstractOperation(),        // 매개변수 Calculator생성자 이용
                    new MultiplyOperation(),
                    new DivideOperation()
            );

            int firNum = 140;
            int secNum = 60;

            int answer = calculator.add(firNum, secNum);
            System.out.println(" + answer = " + answer);

            answer = calculator.substract(firNum, secNum);
            System.out.println(" - answer = " + answer);

            answer = calculator.multiply(firNum, secNum);
            System.out.println(" * answer = " + answer);

            answer = calculator.divide(firNum, secNum);
            System.out.println(" / answer = " + answer);
        }
    }

    class Calculator {
        private AddOperation addOperation; //연산 클래스 객체를 private
        private SubstractOperation substractOperation;
        private MultiplyOperation multiplyOperation;
        private DivideOperation divideOperation;

        public Calculator(AddOperation addOperation, SubstractOperation substractOperation, MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
            this.addOperation = addOperation; //매개변수 생성자,this를 통해 private 객체 접근
            this.substractOperation = substractOperation; //
            this.multiplyOperation = multiplyOperation;
            this.divideOperation = divideOperation;
        }

        public int add(int firstNumber, int secondNumber) { //add,빼기 등등 사칙연산 메소드까지
            return addOperation.operate(firstNumber, secondNumber); //가능한 이유는 객체를 생성자로 받아옴
        }   //받아온 사칙연산 객체를 이용하기 위해 객체 내부의 메소드를 이용한 int함수로 표현

        public int substract(int firstNumber, int secondNumber) {
            return substractOperation.operate(firstNumber, secondNumber);
        }

        public int multiply(int firstNumber, int secondNumber) {
            return multiplyOperation.operate(firstNumber, secondNumber);
        }

        public int divide(int firstNumber, int secondNumber) {
            return divideOperation.operate(firstNumber, secondNumber);
        }
    }

    class AddOperation { //사칙연산 클래스에선 int 메소드로 + - * / 만 구현해놓기
        public int operate(int firstNumber, int secondNumber) {
            return firstNumber + secondNumber;
        }
    }

    class SubstractOperation {
        public int operate(int firstNumber, int secondNumber) {
            return firstNumber - secondNumber;
        }
    }

    class MultiplyOperation {
        public int operate(int firstNumber, int secondNumber) {
            return firstNumber * secondNumber;
        }
    }

    class DivideOperation {
        public int operate(int firstNumber, int secondNumber) {
            return firstNumber / secondNumber;
        }
    }
}
