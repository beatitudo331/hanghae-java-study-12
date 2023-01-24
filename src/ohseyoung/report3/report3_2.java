package ohseyoung.report3;

import java.util.Objects;
// 4-2번 문제
public class report3_2 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i<=20; i++){
            if(i%2!=0 &&i%3!=0){
                sum+=i;
            }
        }
        System.out.println("sum="+sum);
    }
}
