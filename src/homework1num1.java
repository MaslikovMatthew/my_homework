import java.util.Scanner;

public class homework1num1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a % 2;

        switch (b) {
            case 0:
                System.out.println(a + 2);
                break;
            case 1:
                System.out.println(a + 1);
                break;

        }
    }
}
