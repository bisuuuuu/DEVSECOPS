package array;
import java.util.Scanner;

public class hash_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Precompute frequencies (hash array of size 13)
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // Query count
        int q = sc.nextInt();
        while (q-- > 0) {
            int number = sc.nextInt();
            // Fetch and print frequency
            System.out.println(hash[number]);
        }

        sc.close();
    }
}
