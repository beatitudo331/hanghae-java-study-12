package sunyeonjeong.report1;

import com.sun.source.doctree.SummaryTree;

import java.net.SocketTimeoutException;

public class Report1_3 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        int change1 = x;
        int change2 = y;

        x = change2;
        y = z;
        z = change1;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}