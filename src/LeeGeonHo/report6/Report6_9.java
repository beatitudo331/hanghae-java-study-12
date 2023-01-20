package LeeGeonHo.report6;

//6-16. 다음 코드의 실행 결과를 예측하여 적어주세요.
class Exercise6_19 {
    public static void change(String str) {
        str += "456";
    }

    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After change:" + str);
    }
}

//str은 지역변수lv 이므로 메서드가 종료됨에 따라 메모리에서 제거.
//즉 다른 주소를 가진 str이 생겨났지만 메서드 종료이후 사라지고 원래의 str만 남아있다.