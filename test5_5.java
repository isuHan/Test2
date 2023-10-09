import java.util.Scanner;
import java.util.Stack;

public class test5_5 {
    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '(') stack.push('(');
            else {
                if(str.charAt(i-1) == '(') {
                    stack.pop();
                    answer += stack.size();
                }else {
                    stack.pop();
                    answer += 1;

                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        test5_5 T = new test5_5();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
