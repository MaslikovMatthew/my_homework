import java.util.Scanner;

public class homework3num4_2  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n_len = in.nextInt();
        int a_int = in.nextInt();
        int sled_int;
        for (int i = 1; i < n_len; ++i) {
            sled_int = in.nextInt();
            if(a_int < sled_int) System.out.print(sled_int + " ");
            a_int = sled_int;
        }
    }
}
