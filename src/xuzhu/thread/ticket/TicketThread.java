package xuzhu.thread.ticket;

public class TicketThread extends Thread {
	private int ticket = 10;

	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (this) {
				if (this.ticket > 0) {
					try {
						//Thread是当前运行同步代码块的线程
                    	//休眠100毫秒，避免太快导致看不到执行过程
						Thread.sleep(100);
						System.out.println(Thread.currentThread().getName()
								+ "卖票---->" + (this.ticket--));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public static void main(String[] arg) {
		TicketThread t1 = new TicketThread();
		//t1  ->  the object whose run method is invoked when this thread is started
		new Thread(t1, "线程1").start();
		new Thread(t1, "线程2").start();
		// 也达到了资源共享的目的，此处网上有各种写法，很多写法都是自圆其说，举一些特殊例子来印证自己的观点，然而事实却不尽如此。
	}
}
