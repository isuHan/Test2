import java.util.Scanner;

public class test3_5 {

    public int solution(int n) {
        int answer = 0, sum = 0, lt = 0;
        int m = n / 2 + 1;
        int[] arr = new int[m];
        for(int i=0; i<m; i++) arr[i] = i+1;

        //rt의 값이 n의 절반이 넘는다면 값이 나올 수 없으므로
        for(int rt=0; rt<m; rt++) {
            sum += arr[rt];
            if(sum == n) answer++;
            //sum이 n보다 크면 앞의 값을 빼준다
            while(sum >= n) {
                sum -= arr[lt++];
                if(sum == n) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        test3_5 T = new test3_5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
