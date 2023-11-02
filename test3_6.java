import java.util.Scanner;

public class test3_6 {
    //cnt로 0이 나온 횟수를 계산해서 k보다 작거나 같으면 뒷자리 추가, 크면 앞자리 추가
    //이떄 나온 수열의 길이를 answer과 비교하여 큰 값을 answer에 넣는다
    public int solution(int n, int k, int[] arr) {
        int answer = 0, cnt = 0, lt = 0;
        for(int rt=0; rt<n; rt++) {
            if(arr[rt] == 0) cnt++; //뒷자리에 0이 나오면 더해준다
            while(cnt>k) {
                if(arr[lt] == 0) cnt--; //앞자리를 하나씩 빼주면서 0이 나올떄까지 빼준다
                lt++;
            }
            answer = Math.max(answer, rt+1-lt); //큰 값 대입
        }
        return answer;
    }
    public static void main(String[] args) {
        test3_6 T = new test3_6();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
}
