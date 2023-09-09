import java.util.Scanner;

public class test3_6 {
    public int solution(int n) {
        int answer=0, cnt=1;
        n--;
        while(n>0) {
            cnt++;
            n=n-cnt;
            if(n%cnt==0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        test3_6 T = new test3_6();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
