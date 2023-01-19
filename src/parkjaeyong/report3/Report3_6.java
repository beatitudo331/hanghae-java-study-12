package parkjaeyong.report3;
// 4-6번 문제
public class Report3_6 {
    public static void main(String[] args) {
        int result = 0;
        // 두 주사위 수 합이 6이 나오기 위한 한 쪽의 최대 값은 5이다.
        for(int i = 1, j = 5; i < 6 ; j--){
            if( i+j == 6){
                result++;
                j = 5;
                i++;
            }
        }
        System.out.println(result);
    }
}
