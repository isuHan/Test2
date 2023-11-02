import java.util.Scanner;

//수학적 해결 방법
//합을 분할해준다고 생각
//예를 들어 연속된 자연수가 2개라면 원래 값에서 1을 빼주고 절반을 나눈 다음 1을 넣어준다는 개념
//3개라면 원래 값에서 3을 빼주고 두번째에는 +1, 세번째에는 +2를 해주는 개념
public class test3_5_2 {
    public int solution(int n) {
        int answer = 0, cnt = 1; //연속된 숫자의 개수
        n--; //증가된 cnt만큼 n을 빼줘야 해서?
        while(n>0) {
            cnt++;
            n=n-cnt; //분할이 커짐에 따라 증가해서 빼주기
            if(n % cnt == 0) answer++; //빼준 값이 분할값에 나누어떨어진다면 연속된 합이 존재
        }
        return answer;
    }
    public static void main(String[] args) {
        test3_5_2 T = new test3_5_2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
