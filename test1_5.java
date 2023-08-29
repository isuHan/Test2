import java.util.Scanner;

public class test1_5 {
    public String solution(String str) {
        String answer = "";
        char[] c = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        while(lt<rt) {
            if(Character.isAlphabetic(c[lt])) lt++;
            else if(Character.isAlphabetic(c[rt])) rt--;
            else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);
        return answer;
    }

    public static void main(String[] args) {
        test1_5 T = new test1_5();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
