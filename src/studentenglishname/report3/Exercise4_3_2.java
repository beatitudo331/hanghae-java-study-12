package studentenglishname.report3;

public class Exercise4_3_2 {
    public static void main(String[] args) {
        int sum=0;
        int totalsum=0;
        for(int i=0; i<=10; i++){
            System.out.println("i : "+ i);
            System.out.println("sum : "+ sum);
            sum= sum+i;
            System.out.println("sum+i : "+sum);
            totalsum=totalsum+sum;
            System.out.println("totalsum : "+totalsum);
        }
        System.out.println("final totalsum : "+totalsum);
    }
}
