public class a {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            // Count how many times arr[i] appears
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // If it appears only once, print it and stop
            if (count == 1) {
                System.out.println("The number that appears once is: " + arr[i]);
                break;
            }
        }
    }
}
