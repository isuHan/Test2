import java.util.ArrayList;
import java.util.Scanner;

public class test1_4 {
    public ArrayList<String> solution(int num, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = str.length-1;
            while(lt<rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        /*for (String x : answer) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }*/
        return answer;
    }

    public static void main(String[] args) {
        test1_4 T = new test1_4();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        String[] str = new String[num];
        for(int i=0; i<num; i++) {
            str[i] = kb.next();
        }
        for (String x : T.solution(num, str)) {
            System.out.println(x);
        }
    }
}
