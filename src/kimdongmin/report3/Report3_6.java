package kimdongmin.report3;

//4-6 문제
public class Report3_6 {
}

//정답
class Exercise4_6 {
    public static void main(String[] args) {
        /*빈 칸*/
        int[] dice1 = {1, 2, 3, 4, 5, 6};
        int[] dice2 = {1, 2, 3, 4, 5, 6};

        for(int i=0; i < dice1.length; i++) {
            for(int j=0; j < dice2.length; j++) {
                if(dice1[i] + dice2[j] == 6)
                    System.out.println(dice1[i] + "," + dice2[j]);
            }
        }
        //빈칸끝

    }
}