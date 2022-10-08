import java.util.Scanner;

public class homework4num2{
    public static class MyArrays{
        public static double avgOf4Digits(int[] array){
            int sum = 0;
            int cnt = 0;
            for (int i : array
            ) {
                if (i>999 && i<10000){
                    sum += i;
                    cnt++;
                }
            }
            if (cnt != 0){
                return(double) sum/cnt;
            }else{
                return -1;
            }
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num_len = in.nextInt();
        int[] array = new int[num_len];
        for (int i = 0; i < num_len; ++i){
            array[i] = in.nextInt();
        }
        System.out.println(MyArrays.avgOf4Digits(array));
    }
}
