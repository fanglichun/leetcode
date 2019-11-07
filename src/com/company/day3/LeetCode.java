package com.company.day3;

/**
 * @ClassName LeetCode
 * @Description
 * @Author fanglichun
 * @Date 2019-11-06 20:31
 * @Version 1.0
 **/
public class LeetCode {
    /**
     * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
     * <p>
     * 示例：
     * <p>
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        //定义头结点 下一节点地址默认为null
        ListNode headNode = new ListNode(0);
        //定义当前结点为头结点
        ListNode cur = headNode;
        //两个结点对象都不为空时对结点元素进行比较
        while (l1 != null && l2 != null) {
            //比较两个结点对象的元素值大小
            if (l1.val < l2.val) {
                //当前结点的下一节点地址指向l1
                cur.next = l1;
                //当前结点的头结点后移
                cur = cur.next;
                //l1指向下一结点的地址
                l1 = l1.next;
            } else {//同上
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        // 任一为空，直接连接另一条链表
        if (l1 == null) {
            cur.next = l2;
        } else {
            cur.next = l1;
        }
        return headNode.next;
    }

}
