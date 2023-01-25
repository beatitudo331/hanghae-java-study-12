package kwonjaehyun.report3;
//4-10번 문제
public class Report3_10 {
    public static void main(String[] args) {
        // 1~100사이의 임의의 값을 얻어서  answer에 저장한다.
        int answer = (int)(Math.random()*100)+1;
        int input = 0; //사용자입력을 저장할 공간
        int count = 0; //시도횟수를 세기위한 변수
        // 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
        java.util.Scanner s = new java.util.Scanner(System.in);
        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요 : ");
            input = s.nextInt(); //입력받은 값을 변수 input에 저장한다.
            if (answer == input) {
                System.out.println("정답입니다.");
                System.out.println("시도횟수는 "+count+"입니다.");
                break;
            } else if (answer<input) {
                //내가 더 큰수를 입력하면
                System.out.println("더 작은수를 입력하세요");
            }else if (answer>input) {
                //내가 더 큰수를 입력하면
                System.out.println("더 큰수를 입력하세요");
            }
        } while(true); //무한반복문
    }
}
