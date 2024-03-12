import java.util.Scanner;

public class RecursivelyPrintNumbers {
    public static void printtillN(int n){
        if(n == 0){
            return;
        }
        printtillN(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        printtillN(n);
    }
}
