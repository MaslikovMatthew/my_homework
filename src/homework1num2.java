import java.util.Scanner;
public class homework1num2{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int d = in.nextInt();
        int n = in.nextInt();

        a = a*n;
        d = d*n;
        if(d > 100)
        {
            while(d>99)
            {
                a++;
                d-=100;
            }
        }
        System.out.println(a +" "+ d);

    }
}
