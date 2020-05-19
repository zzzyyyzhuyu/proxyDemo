package com.wimp.task.proxy;

import com.wimp.task.MyTask;

/**
 * @author zy
 * @date 2020/5/19
 * <p>
 *  代理类
 */
public class TaskProxy implements MyTask {
    private MyTask myTask;

    public TaskProxy(MyTask myTask){
        this.myTask = myTask;
    }

    @Override
    public void doTask() {
        before();
        myTask.doTask();
        after();
    }

    /**
     * 前执行方法
     */
    private void before() {
        System.out.println("代理执行前，执行前执行方法");
    }

    /**
     * 后执行方法
     */
    private void after() {
        System.out.println("代理执行后,执行后执行方法");
    }

}
