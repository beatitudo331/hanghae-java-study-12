package kwonjaehyun.report3;
//4-5번 문제 다음의 for문을 while문으로 변경하세요.
public class Report3_5 {
    public static void main(String[] args) {
        int i=0,j=0;
        while(i<=10)
        {
            j = 0;//초기화 까먹지 말것
            while(j<=i)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        }//end of main
    } // end of class