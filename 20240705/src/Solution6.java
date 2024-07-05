import java.util.HashSet;

class Solution6 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // 创建一个哈希集用于滑动窗口
        HashSet<Integer> hashSet = new HashSet<>();

        // 遍历数组
        for (int i = 0; i < nums.length; i++) {
            // 如果当前元素在哈希集中，说明在 k 范围内有重复
            if (hashSet.contains(nums[i])) {
                return true;
            }
            // 将当前元素添加到哈希集中
            hashSet.add(nums[i]);

            // 保持哈希集的大小为 k
            if (hashSet.size() > k) {
                // 移除窗口最左边的元素
                hashSet.remove(nums[i - k]);
            }
        }

        // 如果没有发现重复，返回 false
        return false;
    }
}
