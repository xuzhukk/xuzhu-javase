package xuzhu.staticexecutionsequence;

public class TestStatic1 {
	public static int a = 1;
    public static int b = 3;
    public static String str;

    static {
        str = "i am here";
        a = 10;
        b = 30;
    }

    public static void main(String[] args) {
        System.out.println(TestStatic1.str);
        System.out.println(TestStatic1.a);
        System.out.println(TestStatic1.b);
    }
}

//上面的输出结果说明static静态代码块中的初始化操作覆盖了在定义变量时的初始化操作，即它们是按照在代码中书写的顺序依次进行初始化的，所以后面的赋值操作会覆盖前面的值。
