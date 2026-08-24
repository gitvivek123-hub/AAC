import java.util.Scanner;

public class Armstrng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check\n");
        int n = sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }

        if(sum==temp){
            System.out.println("number is armstrong");
        }
        else{
            System.out.println("number is not armstrong");
        }
        sc.close();
    }
    
}
