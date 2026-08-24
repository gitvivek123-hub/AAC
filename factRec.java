import java.util.Scanner;

public class factRec {
    public static void main(String[] args) {
        
        System.out.println("enter number to calculate factorial");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Factorial of " + n + " is: " + factorial(n));
        sc.close();

    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
}
