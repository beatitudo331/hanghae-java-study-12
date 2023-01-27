//4-4. 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때,
//몇까지 더해야 총합이 100 이상이 되는지 구하세요.
package LeeJaeHun.Report3;
//4-5. 다음의 for문을 while문으로 변경하세요.
class Report3_5 {
    public static void main(String[] args) {
        int i =0;
        int j =0;
        while(i< 11){
            j=0;
            while(j<=i){
                System.out.print("*");

                j++;
            }
            System.out.println();
            i++;
        }
    }//end of main
}