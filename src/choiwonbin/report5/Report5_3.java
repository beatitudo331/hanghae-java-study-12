package choiwonbin.report5;
//  6-5
public class Report5_3 {
    static class playingcard{           //  오류나서 alt+enter쳐서 보니 main static을 없애거나 playingcard에 static를 추가하라고 해서 추가했습니다.
   int kind;
   int num;
   static int width;
   static int height;

   playingcard(int k, int n){
       kind = k;
       num = n;
   }

    public static void main(String[] args) {
        playingcard card = new playingcard(1,1);
    }
}
}