import java.util.Scanner;

public class multiplyNnumber {

    static int multiplyOfFirstNnumber(int n){
        if(n == 1){
            return 1;
        }
        int recAns = multiplyOfFirstNnumber(n-1);
        int myAns = recAns * n;
        return myAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int ans = multiplyOfFirstNnumber(n);
        System.out.println("First "+n+" multyplication number "+ans);
    }
}
