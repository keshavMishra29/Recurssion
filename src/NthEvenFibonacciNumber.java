import java.util.Scanner;

public class NthEvenFibonacciNumber {
    public static int NthEvenFibonacci(long n){
        if (n == 0){
            return 0;
        }
        if(n == 1){
            return 2;
        }
        return (4*NthEvenFibonacci(n-1)+NthEvenFibonacci(n-2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long n = sc.nextLong();
        System.out.println(NthEvenFibonacci(n));
    }
}
