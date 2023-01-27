package choyoungjun.SOLID;
//원칙 적용 방법
//고수준 모듈의 변화되는 부분을 추상화합니다.
//저수준 모듈을 추상화에 의존시킵니다.
//계산기 클래스에 추상화된 부모 클래스를 포함시킵니다. ok
//연산 클래스는 추상화된 부모 클래스를 상속받아 기능별로 구현합니다. ok

//문제
//계산기(고수준 모듈)가 개별 연산 클래스(저수준 모듈)을 포함하며 계산 기능을 구현할 때 연산 클래스에 의존하고 있습니다.
//저수준 모듈에서 변경이 발생되면 고수준 모듈에 수정사항이 발생합니다.

import java.util.HashMap;
import java.util.Map;

//클라이언트는 calculator를 통해 통신해야 한다.
public class DIP {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Calculator calculator = new Calculator(
                new AddOperation(),
                new SubstractOperation(),
                new MultiplyOperation(),
                new DivideOperation()
        );

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
class Calculator {

    private AbstractOperation abstractOperation;

    Map<String, AbstractOperation> abstractOperationMap = new HashMap<>();
    public Calculator(AbstractOperation...abstractOperations) throws InstantiationException, IllegalAccessException {
        for (AbstractOperation abstractOperation : abstractOperations){
            abstractOperationMap.put(abstractOperation.getOperator(), abstractOperation.getClass().newInstance());
        }
    }

    public void setAbstractOperation(AbstractOperation abstractOperation) {
        this.abstractOperation = abstractOperation;
    }

    public int calculate(String operator, int firstNumber, int secondNumber) {
        int answer = 0; // 문제 : operator라는 string과 그 주인장을 연결시켜야 함
        abstractOperation = abstractOperationMap.get(operator);
        answer = abstractOperation.operate(firstNumber, secondNumber);
        return answer;
    }
}
abstract class AbstractOperation{
    private String operator;

    public abstract int operate(int firstNumber, int secondNumber);

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

}

class AddOperation extends AbstractOperation{
    AddOperation(){
        this.setOperator("+");
    }
    @Override
    public int operate(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}
class SubstractOperation extends AbstractOperation {
    SubstractOperation(){
        this.setOperator("-");
    }
    @Override
    public int operate(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
}

class MultiplyOperation extends AbstractOperation{
    MultiplyOperation(){
        this.setOperator("*");
    }
    @Override
    public int operate(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
}

class DivideOperation extends AbstractOperation{
    DivideOperation(){
        this.setOperator("/");
    }
    @Override
    public int operate(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }
}