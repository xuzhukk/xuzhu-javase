package xuzhu.staticexecutionsequence;

public class TestStatic2 {

	static {
        str = "i am here";
        a = 10;
        b = 30;
    }
    public static int a = 1;
    public static int b = 3;
    public static String str;

    public static void main(String[] args) {
        System.out.println(TestStatic2.str);
        System.out.println(TestStatic2.a);
        System.out.println(TestStatic2.b);
    }
}
/*
 * 
 * static静态代码块其实完全可以看做是一个没有名字、没有参数、没有返回值的静态方法，这个静态方法会在main方法执行前执行，而且是主动执行的，不需要任何显示调用，除此之外它和普通的静态方法没有任何区别，因此对普通静态方法适用的规则也适用于该static静态代码块，比如：
 
1. 无法在静态方法里引用实例变量、也无法调用实例方法，但是可以调用静态变量和静态方法，你甚至可以在static静态代码块里调用main方法，都是没有问题的

2. 无法在静态方法里使用this关键字和super关键字（因为this关键字指向该方法所属的对象，而静态方法是属于类级的，不存在对象一说；至于super关键字，只要不是用在构造方法里，那么 
   它就是指向父类对象的，而静态方法是不能引用实例对象的，因此也不能使用super关键字）

3. 无法在静态方法里声明其他静态变量（其实这一点不只是静态方法才适用，包括实例方法也无法在方法体中声明静态变量，因为静态变量属于类变量）

4. 无法在静态方法里使用域修饰符来声明变量：public、protected、private，只能使用默认的访问域（这一点实例方法也是适用的）
 * 
 * 
 * 
 * 
 * 
 */



