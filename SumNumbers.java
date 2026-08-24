import java.util.Scanner;

class SumNumbers{
    static int recursiveSum(int n){
        if(n==0)
            return 0;

        return n+recursiveSum(n-1);
    }

    static int iterativeSum(int n){
        int sum=0;

        for(int i=1;i<=n;i++)
            sum+=i;

        return sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        System.out.println("Iterative="+iterativeSum(n));
        System.out.println("Recursive="+recursiveSum(n));
    }
}