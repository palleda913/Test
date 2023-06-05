public class Main {
    public static void moveZ(int[] nums) {
        int Count = 0;  

        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[i - Count] = nums[i];
            } else {
               Count++;
            }
        }

        
        for (int i = nums.length - Count; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZ(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
        
    }
}