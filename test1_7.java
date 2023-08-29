import java.util.Scanner;

public class test1_7 {
    public String solution(String str) {
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer = "YES";

        /*str = str.toLowerCase();
        int len = str.length();
        for(int i=0; i<len/2; i++) {
            if(str.charAt(i) == str.charAt(len-1-i)) return "YES";
        }*/
        return answer;
    }

    public static void main(String[] args) {
        test1_7 T = new test1_7();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
