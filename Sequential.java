import java.util.Scanner;

public class Sequential {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("entter array size");
    int n = sc.nextInt();
    System.out.println("enter array elements");
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println("enter element to search");
    int key = sc.nextInt();
    for (int i = 0; i < n; i++) {
        if (arr[i] == key) {
            System.out.println("element found at index " + i);
            return;
        }
    }

    System.out.println("element not found");
    
    sc.close();

}
    
}
