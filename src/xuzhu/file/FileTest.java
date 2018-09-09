package xuzhu.file;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("c:\\a.txt");

		System.out.println(file.exists());

		// File对象是否是目录

		System.out.println(file.isDirectory());

		// 对象是否是文件

		System.out.println(file.isFile());
	}
}
