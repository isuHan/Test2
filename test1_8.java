import java.util.ArrayList;
import java.util.Scanner;

public class test1_8 {
    public String solution(String str) {
       String answer = "NO";
       str = str.toUpperCase().replaceAll("[^A-Z]", "");
       String tmp = new StringBuilder(str).reverse().toString();
       if(str.equals(tmp)) answer = "YES";
       return answer;
    }

    public static void main(String[] args) {
        test1_8 T= new test1_8();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
