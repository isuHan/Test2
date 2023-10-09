import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int id;
    int priority;

    public Person(int id, int red) {
        this.id = id;
        this.priority = red;
    }
}

public class test5_8 {
    public int solution(int n, int m, int[] emArr) {
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();
        for(int i=0; i<n; i++) {
            Q.offer(new Person(i, emArr[i]));
        }
        while(!Q.isEmpty()) {
            Person tmp = Q.poll();
            for(Person x : Q) {
                if(x.priority > tmp.priority) {
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null) {
                answer ++;
                if(tmp.id == m) {
                    return answer;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        test5_8 T = new test5_8();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] emArr = new int[n];
        for(int i=0; i<n; i++) {
            emArr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, m, emArr));

    }
}
