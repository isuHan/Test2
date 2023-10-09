import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test5_7 {
    public String solution(String n, String m) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for(char x : n.toCharArray()) {
            Q.offer(x);
        }
        for(char y : m.toCharArray()) {
            if(Q.contains(y)) {
                if(y != Q.poll()) return "NO";
            }
        }
        if(!Q.isEmpty()) {
            answer = "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        test5_7 T = new test5_7();
        Scanner kb = new Scanner(System.in);
        String n = kb.next();
        String m = kb.next();
        System.out.println(T.solution(n,m));
    }
}
