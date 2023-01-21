package josungjae.report3;
//4-4번 문제
class Report3_4 {
    public static void main(String[] args) {
        int sum = 0; // 총합을 저장할 변수
        int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
        int num = 0;

        for (int i = 1; true; i++, s = -s) {
            num = s * i;
            sum += num;

            if (sum >= 100)
            break;
        }

        System.out.println("num="+num);
        System.out.println("sum="+sum);
    }
}
