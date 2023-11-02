import java.util.Scanner;

public class test3_3 {
    //입력받는 수를 k만큼 잘리서 더해주고 큰 값으로 리턴
    //다음 차례로 넘어갈 떄마다 앞 값 뺴고 뒤값 더함
    public int solution(int n, int k, int[] arr) {
      int answer = 0, sum = 0;
      for(int i=0; i<k; i++) sum += arr[i]; //첫번째 합
      answer = sum;
      for(int i=k; i<n; i++) { //앞의 값 빼주고 뒤의 값 더해주며 비교
          sum += (arr[i] - arr[i-k]);
          answer = Math.max(answer, sum);
      }
      return answer;
    }
    public static void main(String[] args) {
        test3_3 T = new test3_3();
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
