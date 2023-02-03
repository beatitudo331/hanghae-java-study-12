package choijenoghwan.report1;
// 2-8번 문제
public class Report1_3 {
    public static void main(String[] args){
        int x = 1;
        int y = 2;
        int z = 3;
        int tmp;
        tmp = x; // tmp = 1, x = 1, y = 2, z = 3
        x = y; // tmp = 1, x = 2, y = 2, z = 3
        y = z; // tmp = 1, x = 2, y = 3, z = 3
        z = tmp; // tmp = 1, x = 2, y = 3, z = 1

        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
}
//예상 결과 : x=2, y=3, z=1