import java.util.Scanner;

public class FactorialRecursively {
    public static int rec(int n){
        if(n == 1){
            return 1;
        }
        int recAns = rec(n-1);
        int myAns = n * recAns;
        return myAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(rec(n));
    }
}
