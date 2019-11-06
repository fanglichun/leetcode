package com.company;

import java.util.Arrays;

/**
 * @ClassName LeetCode
 * @Description
 * @Author fanglichun
 * @Date 2019-11-06 20:31
 * @Version 1.0
 **/
public class LeetCode {
    /**
     * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     * <p>
     * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                ++j;
                nums[j] = nums[i];
            }
        }
        return ++j;
    }

    /**
     * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
     */

    public static void rotate1(int[] nums, int k) {

        /**
         *
         * 输入: [1,2,3,4,5,6,7] 和 k = 3
         * 输出: [5,6,7,1,2,3,4]
         * 解释:
         * 向右旋转 1 步: [7,1,2,3,4,5,6]
         * 向右旋转 2 步: [6,7,1,2,3,4,5]
         * 向右旋转 3 步: [5,6,7,1,2,3,4]
         *思路：先0~n-1整体翻转，在0~k-1翻转，最后k-n-1翻转
         *12345 -》 54321 -》 34521 -》34512
         */

        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void rotate2(int[] nums, int k) {
        int n = nums.length;
        //总共需要移动几轮
        k = k % n;
        for (int i = 0; i < k; i++) {
            //记录末尾下标对应的值
            int temp = nums[n-1];
            //从后往前移动
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            System.out.println(i);
            System.out.println(Arrays.toString(nums));
            //每轮移动完成后,首位和末尾进行交换
            nums[0] = temp;
        }
    }


    /**
     * 翻转函数,每次首位和末尾下标数据进行调换
     * @param nums 数组
     * @param begin 开始下标
     * @param end 结束下标
     */
    private static void reverse(int[] nums, int begin, int end) {
        int temp;
        while (begin < end) {
            temp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = temp;
            begin++;
            end--;
        }
    }
}
