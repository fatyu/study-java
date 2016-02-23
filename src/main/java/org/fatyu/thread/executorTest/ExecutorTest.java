package org.fatyu.thread.executorTest;

/**
 * 使用执行器的好处:
 * 1.因为线程的创建消耗的代价比较高,如果程序使用很多生命周期短的线程,要考虑使用线程池.
 * 2.减少并发线程的数量
 * 使用调度器进行线程的调度处理
 * @author Fatyu
 *
 */
public class ExecutorTest{

    public static void main(String[] args){
	//线程池的3种创建方法
	//1.使用Executors.newCacheThreadPool()--创建一个可根据需要创建新线程的线程池
	//2.使用Executors.newFixedThreadPool()--创建一个固定大小的线程池
	//3.使用Executors.newSingleThreadExecutor()--创建一个只有一个线程的线程池.顺序执行
    }
}
