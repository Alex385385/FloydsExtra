import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        final int INFINITY = 1000000;
        int W[][] = {{0, 1, INFINITY, 1, 5},
                     {9, 0, 3, 2, INFINITY},
                     {INFINITY, INFINITY, 0, 4, INFINITY},
                     {INFINITY, INFINITY, 2, 0, 3},
                     {3, INFINITY, INFINITY, INFINITY, 0}};
        int P[][] = new int[5][5];
        Floyds bg = new Floyds();

        bg.floyd(5, W, W, P);

        System.out.println("D Array is: " + Arrays.deepToString(W));

        System.out.println("P Array is: " + Arrays.deepToString(P));


        int x = 0;
        while(x != -1) {
            System.out.println();
        }

        bg.path(1,4, P);
    }
}
