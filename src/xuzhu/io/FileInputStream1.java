package xuzhu.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * ？
 */
public class FileInputStream1 {
	public static void main(String[] args) {
		InputStream in;
		//File file = new File("E://text.txt");
		File file = new File("resource/utf-8.txt");
		System.out.println("text.txt is exist:"+file.exists());
		//这里text.txt已经设置成utf-8格式了 一个字符占用3个字节
		/*
		 * 字节：是由8个二进制数组成，也就是8个0或一组成。
                            字符：字符的大小由实际的编码规则有关
           GBK中一个汉字由2个字节组成，而在utf-8中一个汉字由3个字节组成。
           GBK中一个英文由1个字节组成，在utf-8中一个英文由1个字节组成。
           
           byte数组作为一个缓冲区，每次存入和缓冲区一样大小（byte.length）的数据。
                           那么byte[]中缓冲区大小取多少合适呢，这个要取决于你的文件数据内容大小了
		 * 
		 * 
		 */
		byte[] b = new byte[3];
		try {
			in = new FileInputStream(file);
			int len = 0;
			//第一次str的内如为空 但是len为3  相当于第一次没有存在b数组里面   有点疑惑？
			while ((len=in.read(b))!= -1) {
				String str = new String(b);
				System.out.println(str);
				System.out.println(len);
				//len++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
