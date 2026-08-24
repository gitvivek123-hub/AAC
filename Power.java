import java.util.Scanner;

class Power{
    static int recursivePower(int x,int n){
        if(n==0)
            return 1;

        return x*recursivePower(x,n-1);
    }

    static int iterativePower(int x,int n){
        int result=1;

        for(int i=1;i<=n;i++)
            result=result*x;

        return result;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        int n=sc.nextInt();

        System.out.println("Iterative="+iterativePower(x,n));
        System.out.println("Recursive="+recursivePower(x,n));
    }
}