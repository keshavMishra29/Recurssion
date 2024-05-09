import java.util.Scanner;

public class PrintStairPath {
    static void helper(int n, int start, String currPath){

        if (start > n){
            return;
        }
        if (start == n){
            System.out.println(currPath);
            return;
        }
        //1 step
        helper(n, start +1, currPath +"1");
        //2nd step
        helper(n, start +2, currPath +"2");
        //3rd step
        helper(n, start +3, currPath +"3");
    }
    static void printStairPaths(int n,String pathSoFar) {
        //Write your code here
        helper(n, 0, pathSoFar);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        printStairPaths(n,"");
    }
}
