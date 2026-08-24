import java.util.Scanner;

public class nthfibrec {
    public static void main(String[] args) {
        System.out.println("Enter the position of the Fibonacci number to calculate:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The Fibonacci number at the given position is: " + fibonacci(n));
        sc.close();   
        
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
}
