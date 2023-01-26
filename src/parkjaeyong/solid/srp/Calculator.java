package parkjaeyong.solid.srp;

public class Calculator {

    private AddOperation addOperation;
    private SubstractOperation substractOperation;
    private MultiplyOperation multiplyOperation;
    private DivideOperation divideOperation;

    /*
    SRP : 단일 책임의 원칙으로 하나의 클래스는 하나의 책임을 가져야한다는 객체지향  설계 원칙 중 하나로, 해당 계산기 클래스에는 기존에
    사칙연산 관련된 연산을 하나의 메서드에서 모두 처리했으며, 클래스 입장에서는 기능에 따른 4가지 역할을 하나의 클래스에서 처리하고 있었다.
    이럴경우 변경사항들에 대해서 내부적으로 높은 의존성을 갖게된다. 그렇기에 각 기능별로 별도의 클래스를 만들고  각각의 연산 기능을 나눔으로
    각각의 분리된 클래스로부터 하나의 연산기능을 수행하도록 책임을 부여했다. 이럴경우 하나의 클래스에서 추후 변경이 발생하더라도 다른 클래스에는 전혀
    영향을 주지 않기에 유지보수성이 높아진다. SRP를 지키지 않았다면 수정을 하면서 발생되는 변경지점들을 모두 확인하여 변경사항에 대해서 적절하게 필요한
    부분들은 수정을 해주어야할 것이다.
     */
    public Calculator(AddOperation addOperation, SubstractOperation substractOperation, MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
        this.addOperation = addOperation;
        this.substractOperation = substractOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }

    public int add(int firstNumber, int secondNumber){
        return addOperation.operate(firstNumber,secondNumber);
    }

    public int substract(int firstNumber, int secondNumber){
        return substractOperation.operate(firstNumber, secondNumber);
    }

    public int multiply(int firstNumber, int secondNumber){
        return multiplyOperation.operate(firstNumber, secondNumber);
    }

    public int divide(int firstNumber, int secondNumber){
        return divideOperation.operate(firstNumber, secondNumber);
    }
}