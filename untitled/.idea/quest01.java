//public class quest01 {
//    public static void main(String[] args) {
////2-4. 다음 중 변수를 잘못 초기화 한 것은?
        //byte b = 256; //byte는 -128~127까지임으로 (byte)256이여야함
        //char c = ''; //공백문자의 부재
        //char answer = 'no'; // char는 영단어 하나만
        //float f = 3.14 //함수는 뒤에 f가 붙어야함
        //double d = 1.4e3f;
//    }
//}

//public class quest02 {
//    public static void main(String[] args) {
////2-7. 다음 문장들의 출력 결과를 적으세요. 오류가 있는 문장의 경우, '오류' 라고 적으세요.
////        System.out.println("1" + "2"); // 12
//        System.out.println(true + ""); //true
//        System.out.println('A' + 'B'); //131
//        System.out.println('1' + 2); //51
//        System.out.println('1' + '2'); //99
//        System.out.println('J' + "ava"); //Java
//        //System.out.println(true + null); //오류
//    }
//}

//2-8. 아래는 변수 x, y, z의 값을 서로 바꾸는 예제이다. 결과와 같이 출력되도록 코드를 넣으세요.
//public class quest03{
//    public static void main(String[] args){
//        int x = 1;
//        int y = 2;
//        int z = 3;
//        int temp=0;
//
//        temp=x;
//        x=y;
//        y=z;
//        z=temp;
//
//        System.out.println("x="+x);
//        System.out.println("y="+y);
//        System.out.println("z="+z);
//    }
//}
//예상 결과 : x=2, y=3, z=1
//public class Quest {
//    public static void main(String[] args) {
//        byte b = 10;
//        char ch = 'A';
//        int i = 100;
//        long l = 1000L;
////3-1. 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
//        b = (byte) i; //생략 가능
//        ch = (char) b;
//        short s = (short) ch;
//        float f = (float) l;
//        i = (int) ch;
//    }
//}