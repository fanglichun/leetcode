package com.company.day3;

/**
 * @ClassName ListNode
 * @Description
 * @Author fanglichun
 * @Date 2019-11-07 21:39
 * @Version 1.0
 **/

/**
 * 在Java中，我们可以将单链表定义成一个类，单链表的基本操作即是类的方法，
 * 而结点就是一个个实例化的对象，每个对象中都有“元素值”和“下一结点地址”两个属性。
 * 在“下一结点地址”属性中存储的是下一个对象的引用，这样，一个个对象连在一起就成为了单链表。
 */
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int x) {
        val = x;
    }
}
