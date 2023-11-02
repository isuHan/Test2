public class test7_2 {
    public void DFS(int n) {
        if(n==0) {
            return;
        }else {
            DFS(n/2);
            System.out.print(n%2+" ");
        }
    }


    public static void main(String args[]) {

        test7_2 main = new test7_2();
        main.DFS(11);
    }
}
