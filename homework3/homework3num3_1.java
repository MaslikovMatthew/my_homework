import java.util.Scanner;

public class homework3num3_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n_len = in.nextInt();
        int[] arr = new int[n_len];
        boolean a = true;
        for (int i = 0; i < n_len; ++i) {
            arr[i] = in.nextInt();
        }
        int n = 0;
        for (int i: arr
        ) {
            if(a) {n = i; a = false;}
            if(i > 0 && i < n){ n = i;}
        }
        System.out.println(n);
    }
}