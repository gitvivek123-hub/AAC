public class seqRec {
    
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int n = arr.length;
        int key = 6;

        int result = recursiveSearch(arr, n, key, 0);
        if (result == -1)
            System.out.println("Element not found in the array");
        else
            System.out.println("Element found at index: " + result);
        
    }
    

    public static int recursiveSearch(int arr[], int n, int key, int index)
{
   
    if (index == n)
        return -1;

    
    if (arr[index] == key)
        return index;

   
    return recursiveSearch(arr, n, key, index + 1);
}
}
