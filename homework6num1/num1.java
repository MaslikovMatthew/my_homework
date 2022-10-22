import java.util.Scanner;

public class num1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        byte[] masiv = new byte[a / 8 + Boolean.compare(a % 8 != 0, false)];
        for(int i = 0; i < a; ++i){
            int b = (in.nextBoolean() ? 1 : 0);
            byte c = (byte)(b<<(i % 8));
            masiv[i / 8] = (byte)(masiv[i / 8] | c);
        }
        for(int i = 0; i < a; ++i){
            System.out.print(((masiv[i / 8]&(1<<(i%8)))!=0) + " ");
        }
    }
}
