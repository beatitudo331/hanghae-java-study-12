package koyoungjin.report3;

// 4-5 문제
// 다음의 for문을 while문으로 변경하세요.
public class Report3_5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println(" ");

        // 초기화
        int i=0;
        // i는 10까지 반복
        while(i<=10){
            // 초기화
            int j=0;
            // j는 i까지 반복
            while(j<=i){
                // 별하나 찍어주고 j++로 반복
                System.out.print("*");
                j++;
            }
            // 엔터 후 i++
            System.out.println();
            i++;
        }

    }
}
