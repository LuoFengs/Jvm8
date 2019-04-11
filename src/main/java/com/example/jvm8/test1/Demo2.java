package com.example.jvm8.test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : luofeng
 * @date : Created in 2019/4/11 18:12
 * @description :根据变量b，是成员变量还是局部变量，观察堆内存的变化(C:\Program Files\Java\jdk1.8.0_181\bin\jconsole.exe)
 */
public class Demo2 {

    public Demo2() {
        byte[] b = new byte[128 * 1024];
    }


    public static void main(String[] args) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        fill(1000);
    }

    private static void fill(int n) {
        List<Demo2> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new Demo2());
        }
    }

}
