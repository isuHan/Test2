import java.util.ArrayList;
import java.util.Scanner;

public class test3_1 {
    public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while(p1<n && p2<m) {

        }

        return answer;
    }

    public static void main(String[] args) {
        test3_1 T = new test3_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++) {
            arr1[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++) {
            arr2[i] = kb.nextInt();
        }
        for (int x : T.solution(n, m, arr1, arr2)) {
            System.out.print(x + " ");
        }
    }
}
