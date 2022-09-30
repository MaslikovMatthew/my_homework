import java.util.Scanner;

public class homework2num4{
    public static int min = 10;

    public homework2num4() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for(int i = 0; (double)N - Math.pow(10, i) >= 0; ++i) {
            int dit = (int)((double)N / Math.pow(10, i) % 10);
            System.out.println(dit);
            if (dit < min) {
                min = dit;
            }
        }

        System.out.println(min);
    }
}
