import java.util.Scanner;
public class homework2num1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var i = in.nextInt();
        int suma = i / 100 + (i / 10) % 10 + i % 10;
        int ni = i / 2 * 2 + 2;
        System.out.print(suma);
        System.out.println(" " + ni);
    }
}