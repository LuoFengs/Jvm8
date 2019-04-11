package com.example.jvm8.test1;

import com.example.jvm8.Jvm8Application;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : luofeng
 * @date : Created in 2019/4/11 16:33
 * @description : jvm初体验，内存溢出模拟形成快照文件，通过JProfiler进行分析，得出问题点
 */
public class Demo1 {

    public static void main(String[] args) {

        List<Jvm8Application> list = new ArrayList<>();
        while (true){
            list.add(new Jvm8Application());
        }

    }

}
