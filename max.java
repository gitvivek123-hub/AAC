import java.util.Scanner;

class max{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size: ");
        int n=sc.nextInt();

        int[] a=new int[n];

        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        int max=a[0];

        for(int i=1;i<n;i++){
            if(a[i]>max)
                max=a[i];
        }

        System.out.println("Maximum="+max);
    }
}