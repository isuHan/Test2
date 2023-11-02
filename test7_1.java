public class test7_1 {
    public void DFS(int n) {

        if(n==0) {
            return;
        }else {
            DFS(n-1);
            System.out.print(n+" ");
        }

    }


    public static void main(String args[]) {

        test7_1 main = new test7_1();
        main.DFS(3);
    }
}
