import java.util.Scanner;

public class nthFIbIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position of the Fibonacci number to calculate:");
        int n = sc.nextInt();
        int a=0,b=1;
        while(n>0){
            int c=a+b;
            a=b;
            b=c;
            n--;
        }
        System.out.println("The Fibonacci number at the given position is: " + a);
        sc.close();
    }
    
}
