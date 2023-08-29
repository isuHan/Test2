import java.util.Scanner;

public class test1_3 {
    public String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' '))!=-1) {
            String tmp = str.substring(0, pos);
            if(max<tmp.length()) {
                max = tmp.length();
                answer = tmp;
            }
            str = str.substring(pos+1); //시작점을 공백의 다음 부분으로 변경
        }
        if(str.length()>max) answer = str;

        /*String[] s = str.split(" ");
        for (String x : s) {
            if(max< x.length()){
                max = x.length();
                answer = x;
            }
        }*/

        return answer;
    }

    public static void main(String[] args) {
        test1_3 T = new test1_3();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
