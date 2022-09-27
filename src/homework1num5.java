import java.util.Scanner;

public class homework1num5{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        int third =  in.nextInt();
        boolean First = first / 100 > 0 && first / 100 < 10 && first % 5 == 0;
        boolean Second = second / 100 > 0 && second / 100 < 10 && second % 5 == 0;
        boolean Third = third / 100 > 0 && third / 100 < 10 && third % 5 == 0;
        System.out.println(First && Second || First && Third || Second && Third);
    }
}
