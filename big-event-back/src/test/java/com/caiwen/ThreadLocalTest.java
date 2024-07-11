package com.caiwen;

import org.junit.jupiter.api.Test;

public class ThreadLocalTest {
    @Test
    public void testThreadLocalSetAndGet() {
        //提供一个ThreadLocal对象
        ThreadLocal tl = new ThreadLocal();
        //开启两个线程
        new Thread(() -> {
            tl.set("xiaoyan");
            System.out.println(Thread.currentThread().getName() + tl.get());
            System.out.println(Thread.currentThread().getName() + tl.get());
            System.out.println(Thread.currentThread().getName() + tl.get());
        }, "线程名字1").start();

        new Thread(() -> {
            tl.set("yaochen");
            System.out.println(Thread.currentThread().getName() + tl.get());
            System.out.println(Thread.currentThread().getName() + tl.get());
            System.out.println(Thread.currentThread().getName() + tl.get());
        }, "线程名字2").start();
    }
}
