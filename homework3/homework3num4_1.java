import java.util.Scanner;

public class homework3num4_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n_len = in.nextInt();
        int[] arr = new int[n_len];
        for (int i = 0; i < n_len; ++i) {
            arr[i] = in.nextInt();
        }
        for (int i = 1; i < n_len; ++i) {
            if(arr[i] > arr[i - 1]) System.out.print(arr[i] + " ");
        }
    }
}
