package com.wimp.task.impl;

import com.wimp.task.MyTask;

/**
 * @author zy
 * @date 2020/5/19
 * <p>
 *  被代理接口的实现类
 */
public class MyTaskImpl implements MyTask {

    @Override
    public void doTask() {
        System.out.println("myTaskImpl的执行任务方法");
    }
}
