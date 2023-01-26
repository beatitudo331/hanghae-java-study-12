package kyungyeon.report9.solid.lsp;

//    추가적인 기능이 필요한 자식 클래스가 존재하기 때문에 타입 확인을 진행하고 있습니다.
//    따라서 자식 클래스의 인스턴스가 부모클래스의 인스턴스 역할을 수행하는데 문제가 없다고 할 수 없습니다.
//
//    원칙 적용 방법
//        부모 와 자식 클래스 사이의 행위가 일관성이 있도록 추상화를 좀 더 정교하게 구현합니다.
//        연산 기능을 추상화한 부모 클래스에 피연산자 값의 유효성 검사를 진행하는 메서드를 추가해 줍니다.
//        계산기 클래스에서는 이 메서드를 사용하여 유효성 검사를 진행하고,
//            이 유효성 검사가 필요한 자식 클래스에서는 이 추가된 유효성 검사 조건을 구체화 합니다.
//        isInvalid : 추상 메서드

class Calculator {
    // 연산 기능을 추상화된 부모클래스에 의존하여 처리한다.
    int calculate(AbstractOperation operation, int firstNumber, int secondNumber) {
        return operation.operate(firstNumber, secondNumber);
    }
}

class Client {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int firNum = 140;
        int secNum = 60;

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

abstract class AbstractOperation {
    abstract int operate(int firstNumber, int secondNumber);

    abstract boolean isInvalid(int secondNumber);
}

class AddOperation extends AbstractOperation {
    @Override
    int operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    boolean isInvalid(int secondNumber) {
        return false;
    }
}

class SubstractOperation extends AbstractOperation {
    @Override
    int operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    boolean isInvalid(int secondNumber) {
        return false;
    }
}

class MultiplyOperation extends AbstractOperation {
    @Override
    int operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    boolean isInvalid(int secondNumber) {
        return false;
    }
}

class DivideOperation extends AbstractOperation {
    @Override
    int operate(int firstNumber, int secondNumber) {
        if (isInvalid(secondNumber)) {
            return -999999;
        }
        return firstNumber / secondNumber;
    }

    @Override
    boolean isInvalid(int secondNumber) {
        if (secondNumber == 0) {
            return true;
        }
        return false;
    }
}