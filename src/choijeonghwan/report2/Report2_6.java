package choijenoghwan.report2;
// 3-6번 문제
class Exercise3_6{
    public static void main(String[] args){
        int fahrenheit = 100;
        float celcius = (float)(fahrenheit-32)*5/9*100-(fahrenheit-32)*5*100/9 < 0.5 ?
                (float)Math.floor((float)(fahrenheit-32)*5/9*100)/100 : (float)Math.ceil((float)(fahrenheit-32)*5/9*100)/100;
        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}
//예상 결과 : Fahrenheit:100, Celcius:37.78
