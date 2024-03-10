import java.util.Scanner;

public class DecreasePrintIncreasePrint {
    public static void printDI(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printDI(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        printDI(n);
    }
}
