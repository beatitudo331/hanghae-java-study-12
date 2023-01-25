package choiwonbin.report3;

import java.util.Scanner;

public class Report3_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int answer = (int)(Math.random()*100+1);
        int input = 0;
        int count = 0;
        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요 : ");
            input = sc.nextInt();
            if(answer > input) {
                System.out.println("값이 작습니다.");
            }else if(answer<input){
                System.out.println("값이 큽니다.");
            }else{
                System.out.println("정답입니다."+count+"횟수");
                break;
            }
        }while (true);
    } // end of main
} // end of class
