package xuzhu.io;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * 字节缓冲区
 */
public class ByteArrayOutputStream1 {
	public static void main(String[] args) {
		InputStream in;
		//字节缓冲区
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		//File file = new File("E://text.txt");
		File file = new File("resource/utf-8.txt");
		byte[] b = new byte[3];
		try {
			in = new FileInputStream(file);
			int len = 0;
			String str = null;
			//第一次读的时候没有存在b数组里面
			while ((len = in.read(b)) != -1) {
				//字节缓冲区,所有的字节结合在一起,依次往下添加数据
				outStream.write(b, 0, len);
				byte[] data = outStream.toByteArray();
				str = new String(data, "UTF-8");
				System.out.println(str);
				System.out.println(len);
			}
			System.out.println(str);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
