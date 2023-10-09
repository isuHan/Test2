import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public int solution(int n, int m) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        for(int i=1; i<n+1; i++) {
            Q.offer(i);
        }
        while(!Q.isEmpty()) {
            for(int j=1; j<m; j++) {
                Q.offer(Q.poll());
            }
            Q.poll();
            if(Q.size()==1) {
                answer = Q.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        System.out.println(T.solution(n,m));

    }

}
