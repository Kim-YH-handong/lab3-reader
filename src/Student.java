
public class Student {
	int no;
	String name;
	int age;
	
	public Student(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return no + "-" + name + "-" + age;
	}

}
