import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int row, col;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row: ");
        row = input.nextInt();
        System.out.println("Enter colum: ");
        col = input.nextInt();


        int[][] array = new int[row][col];
        for (row = 0; row < array.length; row++) {
            for (col = 0; col < array[row].length; col++) {
                System.out.println("Element row " + row + " colum " + col);
                array[row][col] = input.nextInt();
            }
        }

        for (int[] b : array) {
            for (int aa : b) {
                System.out.print(aa + "\t");
            }
            System.out.println("\n");
        }

        int max = array[0][0];
        for (row = 0; row < array.length; row++){
            for (col = 0; col < array[row].length; col++) {
                if (max < array[row][col])
                    max = array[row][col];
            }
        }
        System.out.println("Element max is: " + max);
    }
}
