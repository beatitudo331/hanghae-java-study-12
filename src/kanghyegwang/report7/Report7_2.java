class Exercise6_18 {

    /*isNumber 메서드를 작성하세요.*/
    public static boolean isNumber(String str) {
        if(str == null || str.equals("")) return false;
        for(char x : str.toCharArray()) {
            if (x < '0' || x > '9') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
    }
}
//예상 결과 : 123는 숫자입니까? true, 1234o는 숫자입니까? false