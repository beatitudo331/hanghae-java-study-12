package parkjaeyong.solid.ocp;

public class Calculator {
    /*
        OCP: 개방 폐쇄의 원칙으로 현재 문제에서는 계산기에 추가적인 기능들이 확장될 수 있는 확장가능성을 열어두고
        확장시 AbstractOperation를 상속받아 해당 기능에 맞는 operate()를 재정의해서 구현하여 기능을 확장시킬 수 있으며,
        기능이 확장 됨에 따라 계산기 클래스에서는 전혀 변경이 발생하지 않는다. 단순 Client 객체에서 원하는 기능을 구현한
        자식클래스인 객체를 넣어주면 되며, 계산기 클래스에서는 원하는 기능을 구현한 자식 인스턴스를 매개변수로 받아
        연산하는 operate()메서드만 호출해주면 된다. 이 경우 결국 계산기 클래스 calculate() 메서드는 기능확장에 따른
        변화가 전혀 발생하지 않는다. 물론 Client쪽은 자신이 원하는 기능을 요청해야하기에 해당 기능을 구현한 인스턴스를
        매개변수로 전달해줘야하기며, 이것을 변경이라고 생각하기에는 애매한 것 같다.
    */
    public int calculate(AbstractOperation operation,int firstNumber, int secondNumber){
        return operation.operate(firstNumber,secondNumber);
    }

}