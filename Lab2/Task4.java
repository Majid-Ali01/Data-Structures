public class Task4 {

    public static void rotate(int[] nums, int k) {

        k = k % nums.length;

        for (int count = 0; count < k; count++) {

            int last = nums[nums.length - 1];

            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }

            nums[0] = last;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        int k = 3;

        rotate(nums, k);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}