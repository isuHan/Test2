import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test3_2 {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a); //정렬시키기
        Arrays.sort(b);
        int p1 = 0, p2 = 0; //비교값 인덱스
        while(p1<n && p2<m) {
            if(a[p1] == b[p2]) {
                answer.add(a[p1]++); //더 작은 값을 가진 배열의 인덷스를 증가
                p2++;
            }
            else if (a[p1] < b[p2]) p1++; //같을 경우 리턴할 배열리스트에 추가
            else p2++;
        }
        return answer;
    }

    public static void main(String[] args) {
        test3_2 T = new test3_2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for(int i=0; i<n; i++) {
            b[i] = kb.nextInt();
        }
        for (int x : T.solution(n, m, a, b)) {
            System.out.print(x + " ");
        }
    }
}
