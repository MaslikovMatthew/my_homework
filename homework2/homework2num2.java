import java.util.Scanner;
public class homework2num2 {
    public static int a = 0;
    public static int b = 11;
    public static int c = 2;
    public static int en = 0;
    public static int t_en = 0;
    public homework2num2() {
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 1; N > 0; a = i++) {
            if (i % 2 == 1) {
                b *= 3;
                if (b > 19000000) {
                    b = 19000000;
                }
            }
            if (i % 2 == 0) {
                if (en > b) {
                    c = c - (10 * c - b) / 10 + 1;
                }
                en = 10 * c;
                b -= en;
                t_en += en;
            }
            if (t_en > 69) {
                c += t_en / 70;
                t_en%= 70;
            }
        }
        System.out.println(N + " Month\nWolves: " + c + "\nRabbits: " + b + "\n");
    }
}
