import java.util.Scanner;

public class printDescendingNumbers {
    public static void product(int n){
        if (n == 0){
            return;
        }
        System.out.print(n+" ");
        product(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        product(n);
    }
}
