package xuzhu.polym;

/**
 * 多态 
 * 重载-编译多态
 * 运行时多态 (继承 接口)
 * @author xuzhu
 *
 */
public class PolymTest {
	public static void main(String[] args) {
		A b = new B();
		A c = new C();
		A d = new D();
		D d2 = new D();
		b.say();
		c.say();
		d.say();
		d2.say(1);
		d2.say("");
	}
}

abstract class A {
	public abstract void say();
}

class B extends A {

	@Override
	public void say() {
		System.out.println("this is class b");

	}

}

class C extends A {

	@Override
	public void say() {
		System.out.println("this is class c");

	}

	public void say(boolean b) {
		System.out.println("this is class c boolean");
	}

}

class D extends B {

	@Override
	public void say() {
		System.out.println("this is class d");

	}

	public void say(int i) {
		System.out.println("this is class d int");
	}

	public void say(String string) {
		System.out.println("this is class d string");
	}
}
