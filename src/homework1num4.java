import java.util.Scanner;

public class homework1num4 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        var a = Float.parseFloat(str);
        System.out.println((a < -2) || (a > 3 && a < 6) || (a > 9));
    }
}
