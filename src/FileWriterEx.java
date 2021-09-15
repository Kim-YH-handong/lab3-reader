import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Writer w = new FileWriter("output2.txt");
			Student s = new Student(1, "홍길동", 21);
			w.write(s.toString());
			w.close();
	
			System.out.println("학생 정보 저장!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
