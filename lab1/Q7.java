public class Q7 {
    public static void main(String[] args) {

        int[][] arr = {
            {4, 2, 9},
            {7, 6, 3},
            {2, 5, 1}
        };

        System.out.println("Array values are:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int firstColumnSum = 0;

        for (int i = 0; i < arr.length; i++) {
            firstColumnSum += arr[i][0];
        }

        boolean columnMagic = true;

        for (int j = 1; j < arr[0].length; j++) {

            int columnSum = 0;

            for (int i = 0; i < arr.length; i++) {
                columnSum += arr[i][j];
            }

            if (columnSum != firstColumnSum) {
                columnMagic = false;
                break;
            }
        }

        if (columnMagic) {
            System.out.println("The array is Column-Magic");
        } else {
            System.out.println("The array is not Column-Magic");
        }
    }
}