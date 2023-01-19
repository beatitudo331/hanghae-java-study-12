package studentenglishname.report3;


//4-6. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하세요.
class Exercise4_6 {
    public static void main(String[] args) {
        /*빈 칸*/
        for(int i=1; i<=6; i++){
            for(int j=1; j<=6; j++) {
                if(i+j==6){
                    System.out.println("i : "+i+" j : "+j);
                }
                else{
                    System.out.println("6아닌경우* i : "+i+" j : "+j);
                }
            }
        }
    }
}