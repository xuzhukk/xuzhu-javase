package xuzhu.file;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("c:\\a.txt");

		System.out.println(file.exists());

		// File�����Ƿ���Ŀ¼

		System.out.println(file.isDirectory());

		// �����Ƿ����ļ�

		System.out.println(file.isFile());
	}
}
