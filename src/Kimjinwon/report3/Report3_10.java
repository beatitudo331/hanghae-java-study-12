package Kimjinwon.report3;

public class Report3_10 {
    public static void main(String[] args) {
        // 1~100사이의 임의의 값을 얻어서  answer에 저장한다.
        int answer = (int)((Math.random() * 100)+1);
        int input = 0; //사용자입력을 저장할 공간
        int count = 0; //시도횟수를 세기위한 변수

        // 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
        java.util.Scanner s = new java.util.Scanner(System.in);
        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요 : ");
            input = s.nextInt(); //입력받은 값을 변수 input에 저장한다.

            if(input == answer) {
                System.out.println("맞혔습니다");
                break;
            } else if (input < answer) {
                System.out.println("더 큰 수를 입력하세요");
                continue;
            } else if (input > answer) {
                System.out.println("더 작은 수를 입력하세요");
                continue;
            }
        } while(true); //무한반복문
        System.out.println("시도횟수는 " + count + "번입니다.");
    } // end of main
} // end of class
//예상 결과
//1과 100사이의 값을 입력하세요 : 50
//더 큰 수를 입력하세요.
//1과 100사이의 값을 입력하세요 : 75
//더 큰 수를 입력하세요.
//1과 100사이의 값을 입력하세요 : 87
//더 작은 수를 입력하세요.
//1과 100사이의 값을 입력하세요 : 80
//더 작은 수를 입력하세요.
//1과 100사이의 값을 입력하세요 : 77
//더 작은 수를 입력하세요.
//1과 100사이의 값을 입력하세요 : 76
//맞혔습니다.
//시도횟수는 6번입니다.