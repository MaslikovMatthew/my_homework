import java.util.Scanner;

public class homework3num1 {
    public static int n_len = 0;
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in );
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a;
        System.out.print(a + " -> ");
        while(c > 0){
            ++n_len;
            c /= 10;
        }
        int[] ms = new int[n_len];
        while(a > 0){
            ms[n_len - c - 1] = a % 10;
            a /= 10;
            ++c;
        }

        for (int i: ms
        ) {
            System.out.print(i == b ? "" : i);
        }

    }
}