package demo2;

class Solution {
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        int left = 0;
        for (int right = 1; right < len; right++) {
            if (nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0,0};
        System.out.println(removeDuplicates(nums));
        for (int i = 0; i < removeDuplicates(nums); i++) {
            System.out.println(nums[i]);
        }
    }
}