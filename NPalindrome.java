import java.util.Scanner;

public class NPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if it is a palindrome:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        sc.close();
    }
    public static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }
}
