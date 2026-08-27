public class Q9 {
    public static void main(String[] args) {

        int[][] arr = {
            {3, 7, 2},
            {8, 4, 1},
            {5, 9, 6}
        };

        System.out.println("Original array values are:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int[] temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Vertically flipped array is:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}