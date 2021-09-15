import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("output1.txt");
			
			fos.write('A');
			fos.write(65);
			fos.write('\n');
			System.out.println("AA 저장됨!");
			
			String str = "Hello World!!!";
			fos.write(str.getBytes());
			System.out.println("문자열 저장됨!");
			
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
