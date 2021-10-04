package com.kerwin.algorithm.sort;

import com.kerwin.algorithm.sort.top.TopKWithPriorityQueue;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @Description: 排序相关测试
 * @Author KerVinLi
 * @Version 1.0
 */
public class AlgorithmSortTest {

    @Test
    void testTopKWithPriorityQueue() {
        List<TaskJob> list = new ArrayList<>();

        Random random = new Random();
        for (int i = 1; i <= 100; i++) {
            int ranNum = random.nextInt(100);
            TaskJob job = new TaskJob();
            job.setJobName("第" + String.format("%03d",i) + "个任务");
            job.setLevel(ranNum);
            list.add(job);
        }
        TopKWithPriorityQueue<TaskJob> jobQueue = new TopKWithPriorityQueue<TaskJob>(list, 10, true);

        Collections.sort(list);
        list.forEach(obj -> {
            System.out.println(obj);
        });
        System.out.println("----------------------------------------------------------------");

        jobQueue.sortedList().forEach(obj -> {
            System.out.println(obj);
        });
    }



    static class TaskJob implements Comparable<TaskJob>{
        private Integer id;
        /**
         * 任务名称
         */
        private String jobName;
        /**
         * 任务级别 越小级别越高
         */
        private Integer level;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getJobName() {
            return jobName;
        }

        public void setJobName(String jobName) {
            this.jobName = jobName;
        }

        public Integer getLevel() {
            return level;
        }

        public void setLevel(Integer level) {
            this.level = level;
        }

        @Override
        public String toString() {
            return "TaskJob{" +
                    "jobName='" + jobName + '\'' +
                    ", level=" + level +
                    '}';
        }

        @Override
        public int compareTo(TaskJob o) {
            return this.level - o.level;
        }
    }
}
