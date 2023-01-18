package kyungyeon.report2;

class Report2_3 {
    public static void main(String[] args) {

        //3-3. 아래는 변수의 num 값 중에서 백의 자리 이하를 버리는 코드이다.
        //만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다.
        //알맞은 코드를 넣으시오.

        int num = 456;
        int result = num - num % 100;
        int result2 = 100 * (num / 100);

        System.out.println(result);
        System.out.println(result2);
    }
}
