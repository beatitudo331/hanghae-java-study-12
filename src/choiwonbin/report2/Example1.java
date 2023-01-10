package choiwonbin.report2;

public class Example1 {
    private static final String number = "8";
    
    public static void main(String[] args) {
        
        int number = 5;
        
        System.out.println("Example1.number = " + Example1.number);
        System.out.println("number = " + number);

        System.out.println("Example1 + num = " + Example1.number + number);

        System.out.print("Integer.parseInt(Example1.number) + number = ");
        System.out.println(Integer.parseInt(Example1.number) + number);
    }
}
