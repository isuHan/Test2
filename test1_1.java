import java.util.Scanner;

public class test1_1 {
    public int solution(String str, char c) {
        int answer = 0;
        str = str.toLowerCase();
        for (char x : str.toCharArray()) {
            if(x == c) answer++;
        }
        /*for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == c) answer++;
        }*/
        return answer;
    }

    public static void main(String[] args) {
        test1_1 T = new test1_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}
