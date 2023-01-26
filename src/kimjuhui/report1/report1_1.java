package kimjuhui.report1;

public class report1_1 {
    //2-4. 다음 중 변수를 잘못 초기화 한 것은?
//    byte b = 256;
//    char c = '';
//    char answer = 'no';
//    float f = 3.14;
    double d = 1.4e3f;

    //잘못 초기화한 것 : b, c, answer, f
    //이유는 아래와 같다.
    // b : byte의 범위는 -128 ~ 127이다. 범위를 초과하였기 때문에 잘못 초기화한 것.
    // c : char에는 빈 값 저장이 불가능하다. ' ' 이렇게 공백으로 초기화해주어야 한다.
    // answer : char에는 오직 영어로 한 문자만 저장할 수 있다.
    // f = float형은 리터럴 f를 붙여주어야한다.

}

