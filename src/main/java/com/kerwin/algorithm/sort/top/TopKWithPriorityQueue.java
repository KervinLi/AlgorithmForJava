package com.kerwin.algorithm.sort.top;

import lombok.Data;

import java.util.*;

/**
 * @Description: 基于优先队列处理topK问题
 * @Author KerVinLi
 * @Version 1.0
 */
@Data
public class TopKWithPriorityQueue<E extends Comparable> {
    //优先队列
    private PriorityQueue<E> queue;
    //队列最大容量
    private int K;
    //是否topK大元素
    private boolean isTopMax;
    //原始数据列表
    private List<E> list;

    public TopKWithPriorityQueue(List<E> list, int k) {
        this(list, k, true);
    }

    /**
     * topK构造器
     *
     * @param list     topK数据源
     * @param k        topK K值
     * @param isTopMax true:为前K大元素 false:为前K小元素
     */
    public TopKWithPriorityQueue(List<E> list, int k, boolean isTopMax) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException("The source data is empty, meaningless input!");
        }
        if (k <= 0) {
            throw new IllegalArgumentException("The K value is illegal, so this operation is not allowed!");
        }
        if (k > list.size()) {
            throw new IllegalArgumentException("The K value ");
        }
        this.list = list;
        this.K = k;
        this.isTopMax = isTopMax;
        if (isTopMax) {//topK大元素 建立小顶堆
            this.queue = new PriorityQueue<E>(k, new Comparator<E>() {
                @Override
                public int compare(E o1, E o2) {
                    return o1.compareTo(o2);
                }
            });
        } else {
            this.queue = new PriorityQueue<E>(k, new Comparator<E>() {
                @Override
                public int compare(E o1, E o2) {
                    return o2.compareTo(o1);
                }
            });
        }
        //O(N)时间复杂度处理TOPK
        for(E ele:list){
            this.add(ele);
        }
    }

    /**
     * 添加一个元素
     *
     * @param element
     * @return
     */
    public boolean add(E element) {
        if (queue.size() < K) {
            queue.add(element);
        } else {//队列已满
            E temp = queue.peek();
            //将新元素与当前堆顶元素比较，topK大元素保留较小的元素,topK小元素保留较大的元素
            boolean isChange = isTopMax ? element.compareTo(temp) > 0 : element.compareTo(temp) < 0;
            if (isChange) {
                queue.poll();
                queue.offer(element);
            }
        }
        return true;
    }

    /**
     * 获取topK的序列数据
     *
     * @return
     */
    public List<E> sortedList() {
        List<E> list = new ArrayList<E>(queue);
        Collections.sort(list, new Comparator<E>() {
            @Override
            public int compare(E o1, E o2) {
                return isTopMax ? o2.compareTo(o1) : o1.compareTo(o2);
            }
        });
        return list;
    }
}
