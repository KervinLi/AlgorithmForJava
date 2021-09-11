package com.kerwin.algorithm.hash;

import com.kerwin.algorithm.hash.cache.LRUCache;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @Description: hash相关测试
 * @Author KerVinLi
 * @Version 1.0
 */
@Slf4j
public class AlgorithmHashTest {

    /**
     * LRU缓存机制
     */
    @Test
    void testLruCache(){
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1); // 缓存是 {1=1}
        cache.put(2, 2); // 缓存是 {1=1, 2=2}
        log.info("get(1)={}",cache.get(1));     // 返回 1
        cache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
        log.info("get(2)={}",cache.get(2));     // 返回 -1 (未找到)
        cache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
        log.info("get(1)={}",cache.get(1));    // 返回 -1 (未找到)
        log.info("get(3)={}",cache.get(3));    // 返回 3
        log.info("get(4)={}",cache.get(4));    // 返回 4

    }
}
