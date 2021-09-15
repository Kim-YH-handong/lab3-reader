import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderEx {
	
	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("output2.txt");
			
			int data;
			while((data = reader.read()) != -1) {
				System.out.print((char) data);
			}
			reader.close();
			
			System.out.println("\n학생 정보 가져오기 완료!!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
