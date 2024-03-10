import java.util.Scanner;

public class printNtimes {
    public static void printCaptain(int N){
        if (N == 0){
            return;
        }
        System.out.println("Captain");
        printCaptain(N - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        printCaptain(n);
    }
}
