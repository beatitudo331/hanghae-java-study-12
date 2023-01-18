package kimjuhui.report1;

public class report1_3 {

    //2-8. 아래는 변수 x, y, z의 값을 서로 바꾸는 예제이다. 결과와 같이 출력되도록 코드를 넣으세요.
    public static void main(String[] args){
        int x = 1;
        int y = 2;
        int z = 3;
       /*
          알맞은 코드를 넣어 완성하세요.
       */
        int temp = x;
        x = y;
        y = z;
        z = temp;

        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
// 예상 결과 : x=2, y=3, z=1
}
