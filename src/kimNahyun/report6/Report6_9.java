package kimNahyun.report6;

public class Report6_9 {
    public static void change(String str) {
        str += "456";
    }

    public static void main(String[] args) {;
        String str = "ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After change:" + str);
    }
}

// 예상 답 :
// ABC123
// After change : ABC123

//맞았다~!!
// 지역변수 str만 바꾸고 저장은 안 되었기 때문에 456으로 바꾸고 싶으면 클래스를 하나 만들어서 참조형으로 바꿔야한다.