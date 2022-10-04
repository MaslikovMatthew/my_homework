import java.util.Scanner;

public class homework3num3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n_len = in.nextInt();
        boolean a = true;
        int n = 0;
        int c;
        for (int i = 0; i < n_len; ++i) {
            c = in.nextInt();
            if(a) {n = c; a = false;}
            if(c > 0 && c < n){ n = c;}
        }
        System.out.println(n);
    }
}