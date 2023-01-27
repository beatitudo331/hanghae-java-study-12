package choyoungjun.SOLID;
//변화되는 부분을 추상화해서 변화를 고정 시킵니다.
//기능이 추가될 때 클래스의 상속을 통해서 하위 클래스에서 기능을 구현 하도록 합니다.
//기존코드를 수정하지 않아도 객체 상속의 다형성 원리에 의해 기능이 확장 되도록 합니다.
//연산 클래스는 추상화된 부모 클래스를 상속받아 기능별로 구현합니다.
//AbstractOperation : 추상 클래스
//operate : 추상 메서드

//고려사항 : 계산기는 늘 2개의 숫자를 가지고 움직인다.
//안되는거 : 위에 new 연산자로 iv로 주입해버리고싶은데 어떻게 안되나요?

public class OCP {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(
//                new AddOperation(),
//                new SubstractOperation()
//                new MultiplyOperation()
//                new DivideOperation()
        );

        int firNum = 140;
        int secNum = 60;

        int answer = calculator.add(firNum,secNum);
        System.out.println(" + answer = " + answer);

        answer = calculator.substract(firNum,secNum);
        System.out.println(" - answer = " + answer);

        answer = calculator.multiply(firNum, secNum);
        System.out.println(" * answer = " + answer);

        answer = calculator.divide(firNum, secNum);
        System.out.println(" / answer = " + answer);
    }
}
class Calculator {
    private AbstractOperation abstractOperation;

    public void setAbstractOperation(AbstractOperation abstractOperation) {
        this.abstractOperation = abstractOperation;
    }

    public Calculator(AbstractOperation...abstractOperations) {
        for (AbstractOperation abstractOperation : abstractOperations){
            this.setAbstractOperation(abstractOperation);
        }
    } // 가변인자 for문돌려서 자동으로 추가함


    public int add(int firstNumber,int secondNumber){
        setAbstractOperation(new AddOperation());
        return abstractOperation.operate(firstNumber,secondNumber);
    }

    public int substract(int firstNumber, int secondNumber){
        setAbstractOperation(new SubstractOperation());
        return abstractOperation.operate(firstNumber, secondNumber);
    }

    public int multiply(int firstNumber, int secondNumber){
        setAbstractOperation(new MultiplyOperation());
        return abstractOperation.operate(firstNumber, secondNumber);
    }

    public int divide(int firstNumber, int secondNumber){
        setAbstractOperation(new DivideOperation());
        return abstractOperation.operate(firstNumber, secondNumber);
    }


}

class AddOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber+secondNumber;
    }
}

class SubstractOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber-secondNumber;
    }
}

class MultiplyOperation extends AbstractOperation{
    @Override
    public int operate(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
}

class DivideOperation extends AbstractOperation{
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber/secondNumber;
    }
}

abstract class AbstractOperation{
    abstract public int operate(int firstNumber, int secondNumber);
}