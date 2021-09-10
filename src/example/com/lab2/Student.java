package example.com.lab2;

public class Student implements Comparable<Student>{
	private String name;
	private int no;
	private int age;
	
	public Student(String name, int no, int age) {
		super();
		this.name = name;
		this.no = no;
		this.age = age;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getName());
	}
}
