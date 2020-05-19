package com.wimp;

import com.wimp.task.impl.MyTaskImpl;
import com.wimp.task.proxy.TaskProxy;

/**
 * @author zy
 * @date 2020/5/19
 * <p>
 *  
 */
public class StaticProxyMain {
    public static void main(String[] args) {
        //创建代理类
        TaskProxy taskProxy = new TaskProxy(new MyTaskImpl());
        //调用代理累的方法
        taskProxy.doTask();
    }
}
