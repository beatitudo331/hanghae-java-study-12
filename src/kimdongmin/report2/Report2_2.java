package kimdongmin.report2;
// 3-2번 문제
public class Report2_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);
        // true,&& 연산자 먼저 계산되어 false이고 ||의 앞에 있는 y >= 5 가 true이기 때문에 true입니다
        System.out.println(y += 10 - x++);
        // x++는 참조된 후에 계산되므로 10 - x++의 값은 8이고, y에 그 결과값 8을 더한 것이 최종 결과값이므로 13입니다
        System.out.println(x += 2);
        // +=는 오른쪽 피연산자의 값을 왼쪽 피연산자에 더한 뒤 그 값을 출력하므로 3+2가 되어 5입니다
        System.out.println(!('A' <= c && c <= 'Z'));
        // c는 'A'와 같고 'Z'보다는 작으므로 true이고, !는 그 값을 반대로 출력하므로 false입니다
        System.out.println('C' - c);
        // 'C'의 문자코드는 67이므로 67-65는 2 입니다
        System.out.println('5' - '0');
        // '5'와 '0'은 문자코드에서도 연속된 값으로 5칸이 차이나므로 계산 결과 역시 5입니다
        System.out.println(c + 1);
        // c = 'A'이고 'A'는 문자코드 65이므로 65+1은 66입니다
        System.out.println(++c);
        // ++를 c 앞에 붙일 때에는 참조되기 전에 c의 값을 증가시키므로 B가 출력됩니다
        System.out.println(c++);
        // ++를 c 뒤에 붙였으므로 기존 c의 값인 B가 출력되고, 참조된 후에 c의 값이 증가해 C가 됩니다
        System.out.println(c);
        // 위의 c++의 결과 c의 값이 C가 되었습니다


    }
}
