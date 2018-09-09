package xuzhu.singleton;

/*
 * 双检锁机制确实解决了多线程并行中不会出现重复new对象,并且实现了懒加载,但是由于编译器中的优化,指令重排
 * 导致new对象的不确定性
 */
public class DoubleCheckSingleton {

	// 使用volatile来禁止指令重排序优化
	// volatile屏蔽指令重排序的语义在JDK1.5才被完全修复
	private static volatile DoubleCheckSingleton instance;

	private DoubleCheckSingleton() {

	}

	public static DoubleCheckSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckSingleton.class) {
				if (instance == null) {
					// 这行代码在编译后的不确定性 使用volatile来禁止
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}
}
