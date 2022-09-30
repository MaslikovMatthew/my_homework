import java.util.Scanner;

public class homework1num6 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        float y = in.nextFloat();
        System.out.println(((y > x) && (y < 2 - x * x)||(y > 0 && y < x && y < 2 - x * x)) ? "YES" : "NO");
    }
}
