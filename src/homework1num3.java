import java.util.Scanner;
public class homework1num3{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int h = 0;
        int m = 0;
        int s = 0;
        String mm;
        String ss;

        while(a > 59)
        {
            m++;
            a -= 60;
        }
        while(m > 59)
        {
            h++;
            m -= 60;
        }
        while(h>23){h-=24;}
        if(m<10){mm = "0"+m;} else{mm = m+"";}
        if(10 > a){ss="0" + a;} else{ss = a+"";}
        System.out.println(h+":"+mm+":"+ss);

    }
}
