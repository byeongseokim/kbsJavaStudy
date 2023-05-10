package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test1.txt");

			byte a = 10; //byte a~c 1byte씩 출력
			byte b = 20;
			byte c = 30;

			os.write(a);
			os.write(b);
			os.write(c);

			os.flush();
			os.close();
		} catch (IOException e) {  //IO없이 Exception을 써도 됨 (최상위이기 때문에)
			e.printStackTrace();
		}
	}
}