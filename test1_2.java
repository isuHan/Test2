import java.util.Iterator;
import java.util.Scanner;

public class test1_2 {
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if(x >= 97 && x <= 122) answer += (char)(x-32);
            else answer += (char)(x+32);
        }

        /* for (char x : str.toCharArray()) {
            if(Character.isUpperCase(x)) answer += Character.toLowerCase(x);
            else answer += Character.toUpperCase(x);
        }*/

        return answer;
    }

    public static void main(String[] args) {
        test1_2 T = new test1_2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
