import java.util.Scanner;

public class RecursiveMultiplication {
    public static int multiplyy(int n, int m){
        if(n < m){
            return multiplyy(m, n);
        } else if (m != 0) {
            return (n + multiplyy(n, m-1));
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n = sc.nextInt();
        System.out.println("Enter second number: ");
        int m = sc.nextInt();
        System.out.println(multiplyy(n, m));
    }
}
