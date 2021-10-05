package com.kerwin.algorithm.array.iterator;

import java.util.Iterator;

/**
 * @Description: 设计一个迭代器，除了支持 hasNext 和 next 操作外，还支持 peek 操作。
 * 实现 PeekingIterator 类：
 * PeekingIterator(int[] nums) 使用指定整数数组 nums 初始化迭代器。
 * int next() 返回数组中的下一个元素，并将指针移动到下个元素处。
 * bool hasNext() 如果数组中存在下一个元素，返回 true ；否则，返回 false 。
 * int peek() 返回数组中的下一个元素，但 不 移动指针。
 * @link：https://leetcode-cn.com/problems/peeking-iterator
 * @Author KerVinLi
 * @Version 1.0
 */
public class PeekingIterator<T> implements Iterator<T> {
    private Iterator<T> iterator;
    private T nextElement;

    /**
     * 构造函数
     * @param iterator
     */
    public PeekingIterator(Iterator<T> iterator){
        this.iterator = iterator;
        nextElement = iterator.hasNext()?iterator.next():null;
    }

    /**
     * 返回数组中的下一个元素，但不移动指针。
     * @return
     */
    public T peek(){
        return nextElement;
    }

    @Override
    public boolean hasNext() {
        return nextElement != null;
    }

    @Override
    public T next() {
        T ret = nextElement;
        nextElement = iterator.hasNext() ? iterator.next() : null;
        return ret;
    }
}
