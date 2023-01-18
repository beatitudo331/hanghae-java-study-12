package koyoungjin.report2;

public class Report2_5 {
    public static void main(String[] args){
        int num = 10;
        System.out.println(num > 0 ? "양수": (num < 0 ? "음수" : 0));
        
        /*
        num이 0보다 클 경우 "양수", 아닐 경우 (num < 0 ? "음수" : 0) 으로 넘어감
        다시 num이 0보다 작을 경우 "음수", 아닐 경우 0 출력
        
        */
    }
}
