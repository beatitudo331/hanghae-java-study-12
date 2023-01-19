package leesangwon.report3;
//4-2번 문제
public class Report3_2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {            //1~20 반복
            if (i % 2 != 0 && i % 3 != 0) {        //2,3을 나눠서 0이 아니 값
                sum += i;                          // 합산해서 sum에 저장
            }
        }
        System.out.println("sum=" + sum);
    }
}