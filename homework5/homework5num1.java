import java.util.Scanner;

public class homework5num1{
    static void printArray(int[][] a){
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " \t ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[][] a = new int[k][n];
        int i = 0;
        int j = 0;
        for (int c = 0; c < k * n; c++) {
            i = c / n;
            j = c % n;
            a[i][j] = i * j;
        }
        printArray(a);
    }
}
