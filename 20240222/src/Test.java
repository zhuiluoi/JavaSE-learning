import java.util.Arrays;

public class Test {

    //实现一个方法 transform,
    //以数组为参数, 循环将数组中的每个元素乘以 2 , 并设置到对应的数组元素上.
    //例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}

    public static void transform(int[] args) {
        if (args == null) {
            return;
        }
        for (int i = 0; i < args.length; i++) {
            args[i] *= 2;
        }
    }
    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
    //
    //如数组：[1,2,3,4,5,6]
    //
    //调整后可能是：[1, 5, 3, 4, 2, 6]

    public static void adjustNumbers1(int[] args) {
        int tmp = 0;
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args.length-1-i; j++) {
                if (args[j] % 2 == 0) {
                    tmp = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = tmp;
                }
            }
        }
    }

    public static void adjustNumbers2(int[] args) {
        int left = 0;
        int right = args.length - 1;
        while (left <= right) {
            if (args[left] % 2 == 0 && args[right] % 2 != 0) {
                int tmp = args[left];
                args[left] = args[right];
                args[right] = tmp;
            }else if (args[right] % 2 == 0) {
                right--;
            }else if (args[left] % 2 != 0) {
                left++;
            }
        }
    }

    //给定一个整数数组 numbs 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
    //你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
    //你可以按任意顺序返回答案。
    //示例 1：
    //输入：numbs = [2,7,11,15], target = 9
    //输出：[0,1]
    //解释：因为 numbs[0] + numbs[1] == 9 ，返回 [0, 1] 。

    public static int[] sumOfTwoNumbers(int[] numbs, int target) {
        int[] ret;
        for (int i = 0; i < numbs.length; i++) {
            for (int j = 0; j < numbs.length; j++) {
                if (numbs[i] + numbs[j] == target) {
                    ret = new int[]{i, j};
                    return ret;
                }
            }
        }
        ret = new int[]{-1};
        return ret;
    }

    public static int twiceNumbers(int[] args) {
        int ret = 0;
        for (int i = 0; i < args.length; i++) {
            ret ^= args[i];
        }
        return ret;
    }


    public static int mostElements(int[] args) {
        int max = 0;
        int maxCount = 0;
        for (int arg : args) {
            int count = 0;
            for (int i : args) {
                if (arg == i) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                max = arg;
            }
        }
        return max;
    }

    public static boolean threeOddNumbers(int[] args) {
        for (int i = 0; i < args.length-1; i++) {
            if (args[i] % 2 != 0 && args[i+1] % 2 != 0 && args[i+1] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {2, 6, 4, 1};
        System.out.println(threeOddNumbers(array));
        array = new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12};
        System.out.println(threeOddNumbers(array));
    }
}
