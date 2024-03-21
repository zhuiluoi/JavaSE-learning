package demo1;

class Solution {
    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int left = 0;
        for (int right = 0; right < len; right++) {
            if (nums[right] != val) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));
        for (int i = 0; i < removeElement(nums, 2); i++) {
            System.out.println(nums[i]);
        }
    }
}