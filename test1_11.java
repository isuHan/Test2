import java.util.Scanner;

public class test1_11 {
    public String solution(String s) {
        String answer = "";
        s = " "+ s; //첫번째 문자열을 비교할 때 오류 방지를 위해
        int cnt = 1;
        for(int i=0; i<s.length()-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) cnt++;
            else {
                answer += s.charAt(i);
                if(cnt>1) answer+=String.valueOf(cnt);
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        test1_11 T = new test1_11();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
