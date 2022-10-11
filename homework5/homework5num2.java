import java.util.Scanner;

public class homework5num2{

    static void printArray(int[][] a) {
        for (int[] ints : a) {
            for (int anInt : ints){
                System.out.print(anInt + " \t ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int xs = in.nextInt();
        int ys = in.nextInt();
        int[][] matrix = new int[ys][xs];
        int cntr = 0;
        for (int i = 0; i < ys; i += 2) {
            for (int j = 0; j < xs; j++) {
                matrix[i][j] = cntr;
                ++cntr;
            }
            cntr += xs;
        }
        cntr = xs;
        for (int i = 1; i < ys; i += 2) {
            for (int j = xs - 1; j >= 0; --j){
                matrix[i][j] = cntr;
                ++cntr;
            }
            cntr += xs;
        }
        printArray(matrix);
    }
}
