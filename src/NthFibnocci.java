import java.util.Scanner;

public class NthFibnocci {
    public static int fib(int n){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        int a = fib(n-1);
        int b = fib(n-2);
        int nthNumber = a + b;
        return nthNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
