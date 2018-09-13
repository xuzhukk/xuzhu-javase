package xuzhu.thread.ticket;

public class TicketRunnable implements Runnable {

	private int ticket = 10;

    @Override
    public void run() {
        for(int i =0;i<10;i++){
            //添加同步块
            synchronized (this){
                if(this.ticket>0){
                    try {
                        //Thread是当前运行同步代码块的线程
                    	//休眠100毫秒，避免太快导致看不到执行过程
                        Thread.sleep(100);
                        System.out.println(Thread.currentThread().getName()+"卖票---->"+(this.ticket--));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] arg){
        TicketRunnable t1 = new TicketRunnable();
        //t1  ->  the object whose run method is invoked when this thread is started
        new Thread(t1, "线程1").start();
        new Thread(t1, "线程2").start();
    }
}

