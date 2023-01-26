package kimjuhui.report2;

public class report2_1 {
    byte b = 10;
    char ch = 'A';
    int i = 100;
    long l = 1000L;
//3-1. 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
//    b = (byte)i;
//    ch = (char)b;
    short s = (short)ch;
    float f = (float)l;
//    i = (int)ch;

    //정답 : 변수 s, 변수 f
}
