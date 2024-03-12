import java.util.Scanner;

public class PrintBetweenXandY {
    public static void printNumbersInRange(int x, int y){
        if(x>y){
            return;
        }
        System.out.print(x+" ");
        printNumbersInRange(x+1, y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        printNumbersInRange(x,y);
    }
}
