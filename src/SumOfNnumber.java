import java.util.Scanner;

public class SumOfNnumber {

    static int sumOfNnumber(int n){

        if(n == 1){
            return 1;
        }
        int recAns = sumOfNnumber(n-1);
        int myAns = recAns + n;
        return myAns;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int ans = sumOfNnumber(n);
        System.out.println("The ans is: "+ans);

    }
}
