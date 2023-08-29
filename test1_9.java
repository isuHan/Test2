import java.util.Scanner;

public class test1_9 {
    public int solution(String str) {
        /*int answer = 0;
        for (char x : str.toCharArray()) {
            if(x>=48 && x<=57) answer = answer * 10 + (x-48);
        }
        return answer;*/

        String answer = "";
        for (char c : str.toCharArray()) {
            if(Character.isDigit(c)) answer += c;
        }
        return Integer.parseInt(answer); /*Explain*/
    }

    public static void main(String[] args) {
        test1_9 T = new test1_9();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
