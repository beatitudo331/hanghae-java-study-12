package studentenglishname.report4;

public class Mok {
    public static void main(String[] args) {
        String[] words = { "television", "computer", "mouse", "phone" };
        System.out.println(words[1]);

        char[] question = words[1].toCharArray(); // String을 char[]로 변환
        System.out.println("랜덤적용전 : "+question[3]);

        int j = (int) (Math.random() * question.length);
        System.out.println("랜덤적용 후 : "+question[j]);
    } // end of main
} // end of class


