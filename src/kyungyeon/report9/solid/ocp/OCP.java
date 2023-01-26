package kyungyeon.report9.solid.ocp;

//    연산자를 추가하려고 할 때 코드의 변화가 너무 많이 일어납니다.
//    if else 조건문 블록이 존재하며 연산자 추가 시 코드변화가 빈번하게 일어납니다.

//    원칙 적용 방법
//        변화되는 부분을 추상화해서 변화를 고정 시킵니다.
//        기능이 추가될 때 클래스의 상속을 통해서 하위 클래스에서 기능을 구현 하도록 합니다.
//        기존코드를 수정하지 않아도 객체 상속의 다형성 원리에 의해 기능이 확장 되도록 합니다.
//        연산 클래스는 추상화된 부모 클래스를 상속받아 기능별로 구현합니다.
//        AbstractOperation : 추상 클래스
//            operate : 추상 메서드


//---------------------------------------------------------------------------------------
// 솔직히 이 문제는 어떻게 풀어야 할지 잘 모르겠습니다.
// if else문이 빠질 수 있는 방법을 모르겠습니다.
// 고객이 무슨 연산을 원하는지 알 수 없기 때문에 뺄 수는 없을 것이라 생각하는데,
// Calculator에서 빼는 것이 목적이라면, 그 if-else문을 Client class에 넣는 것이 저에게는 최선이었습니다.

class Calculator {
    private AbstractOperation abstractOperation;

    public int calculate(String operator, int firstNumber, int secondNumber) {
        if (operator.equals("+")) {
            abstractOperation = new AddOperation();
        } else if (operator.equals("-")) {
            abstractOperation = new SubstractOperation();
        } else if (operator.equals("*")) {
            abstractOperation = new MultiplyOperation();
        } else if (operator.equals("/")) {
            abstractOperation = new DivideOperation();
        }

        return abstractOperation.operate(firstNumber, secondNumber);
    }
}

class Client {
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

abstract class AbstractOperation {
    public abstract int operate(int firstNumber, int secondNumber);
}

class AddOperation extends AbstractOperation {

    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}

class SubstractOperation extends AbstractOperation {

    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
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
        if (secondNumber == 0) {
            return -999999;
        }
        return firstNumber / secondNumber;
    }
}