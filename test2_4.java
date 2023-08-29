import java.util.Scanner;

public class test2_4 {
    public void solution(int n) {
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for(int i=2; i<n; i++) {
            c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    /*public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for(int i = 2; i<n; i++) {
            answer[i] = answer[i-1] + answer[i-2];
        }
        return answer;
    }*/

    public static void main(String[] args) {
        test2_4 T = new test2_4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        T.solution(n);
    }
}
