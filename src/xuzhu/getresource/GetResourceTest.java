package xuzhu.getresource;

public class GetResourceTest {
	public static void main(String[] args) {
		// 获取当前class的路径 相对路径
		System.out.println(GetResourceTest.class.getResource("").getPath());
		// 获取当前class的bin路径 相对路径
		System.out.println(GetResourceTest.class.getResource("/").getPath());
		// 获取当前工程路径 物理地址
		System.out.println(System.getProperty("user.dir"));
		// 获取所有的类路径 物理地址
		System.out.println(System.getProperty("java.class.path"));
	}
}
