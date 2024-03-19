import java.util.Arrays;

public class Sum_array {
    public static void main(String[] args) {
        int[] values = {10, 51, 53, 39, 47, 44, 21};
        
        int sum = findSumOfSecondAndThirdLargest(values);
        
        System.out.println("Sum of the 2nd and 3rd largest numbers: " + sum);
    }
    
    public static int findSumOfSecondAndThirdLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return 0;
        }
        
        Arrays.sort(arr);
        
        int n = arr.length;
        
        return arr[n - 2] + arr[n - 3];
    }
}
