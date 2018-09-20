package xuzhu.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 在Java5以后，通过Executor来启动线程比用Thread的start()更好。
 * 在新特征中，可以很容易控制线程的启动、执行和关闭过程，还可以很容易使用线程池的特性
 */
public class TestCachedThreadPool {
	public static void main(String[] args) {
		// ExecutorService executorService = Executors.newCachedThreadPool();
		/*
		 * 通过java.util.concurrent.ExecutorService接口对象来执行任务，
		 * 该接口对象通过工具类java.util.concurrent.Executors的静态方法来创建
		 * ExecutorService实际上是一个线程池的管理工具
		 */
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		// ExecutorService executorService = Executors.newSingleThreadExecutor();

		for (int i = 0; i < 5; i++) {
			//当将一个任务添加到线程池中的时候，线程池会为每个任务创建一个线程，该线程会在之后的某个时刻自动执行
			executorService.execute(new TestRunnable());
			System.out.println("************* a" + i + " *************");
		}
		//关闭执行服务对象
		executorService.shutdown();
	}
}

/*
 * 创建任务 任务就是一个实现了Runnable接口的类。创建的时候实现run方法即可。
 */
class TestRunnable implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName() + "线程被调用了。");
		while (true) {
			try {
				Thread.sleep(5000);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
