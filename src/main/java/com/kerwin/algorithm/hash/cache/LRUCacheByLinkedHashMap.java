package com.kerwin.algorithm.hash.cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Description: 基于JDK中LinkedHashMap实现LRU缓存机制
 * @see LRUCache
 * @Author KerVinLi
 * @Version 1.0
 */
public class LRUCacheByLinkedHashMap extends LinkedHashMap<Integer,Integer> {
    private int capacity;

    public LRUCacheByLinkedHashMap(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
