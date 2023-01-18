package kimNahyun.report1;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

// 2-8 번 문제
public class Report1_3 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        int tmp = 10;
        tmp=x;
        x=y;
        y=z;
        z=tmp;

        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
}

// 필요하다면 클래스 추가
class AddClass {
    void test() {
        System.out.println("AddClass.test");
    }


}
