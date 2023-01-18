package parkseongmin.report2;
// 3-6번 문제
public class Report2_6 {
    public static void main(String[] args){
        int fahrenheit = 100;
        float celcius = ((float) 5/9*(fahrenheit-32)*100 - (float) Math.floor((double) 5/9*(fahrenheit-32)*100) < 0.5 ? (float) Math.floor((double) 5/9*(fahrenheit-32)*100)/100:
                        (float) 5/9*(fahrenheit-32)*100 - (float) Math.floor((double) 5/9*(fahrenheit-32)*100) >= 0.5 ? (float) Math.ceil((double) 5/9*(fahrenheit-32)*100)/100 : 0);
                        // 삼항 연산자에서 조건을 2개 넣으려면 :를 꼭 3개 이상 사용해야하는지 궁금합니다.
        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}
