import java.util.Scanner;

public class test1_6 {
    public String solution(String str) {
        String answer = "";
        for(int i=0; i<str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        test1_6 T = new test1_6();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
