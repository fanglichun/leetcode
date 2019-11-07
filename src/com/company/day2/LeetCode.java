package com.company.day2;

/**
 * @ClassName LeetCode
 * @Description
 * @Author fanglichun
 * @Date 2019-11-06 20:31
 * @Version 1.0
 **/
public class LeetCode {


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
