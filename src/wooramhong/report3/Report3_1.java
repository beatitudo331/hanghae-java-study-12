package wooramhong.report3;

import java.util.Scanner;

class Report3_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        if (x>10&&20>x) {
            System.out.println(true);
        }
    }
    public static void main2(String[] args) {
        char ch= 'A';
        if (ch != ' ' || ch !='\t') {
            System.out.println(true);
        }
    }

    public static void main3(String[] args) {
        char ch= 'A';
        if (ch == 'x' || ch == 'X') {
            System.out.println(true);
        }
    }

    public static void main4(String[] args) {
        char ch= 'A';
        if (ch >= '0' && ch <= '9') {
            System.out.println(true);
        }
    }

    public static void main5(String[] args) {
        char ch= 'A';
        if (ch >= 'a' && ch <='z' || ch >= 'A' && ch<='Z') {
            System.out.println(true);
        }
    }

    public static void main6(String[] args) {
        int year=5;
        if (year % 4== 0 || year % 100 != 0) {
            System.out.println(true);
        }
    }

    public static void main7(String[] args) {
        boolean powerOn = false;
        if (powerOn = false) {
            System.out.println(true);
        }
    }

    public static void main8(String[] args) {
        String str = "yes";
        if (str == "yes") {
            System.out.println(true);
        }
    }
}
