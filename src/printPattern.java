import java.util.Scanner;

public class printPattern {
    public static void solve(int n){
        if (n == 0){
            return;
        }
        solve(n-1);
        for (int i = 0; i < n; i++){
            System.out.print("* ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        solve(n);
    }
}
