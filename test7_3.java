public class test7_3 {
    public int DFS(int n) {
        if(n==1) {
            return 1;
        }else {
            return n*DFS(n-1);
        }
    }


    public static void main(String args[]) {

        test7_3 main = new test7_3();
        System.out.println(main.DFS(6));
    }
}
