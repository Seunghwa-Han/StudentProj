package example.com.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<Student>();
		System.out.println("Student List (ordered by name) ");
		
		Student s1 = new Student("Kim",101, 23);
		list.add(s1);
		Student s2 = new Student("Han",102, 21);
		list.add(s2);
		Student s3 = new Student("Ha", 103, 22);
		list.add(s3);
		Student s4 = new Student("You", 104, 24);
		list.add(s4);
		Student s5 = new Student("Choi", 105, 23);
		list.add(s5);
		Student s6 = new Student("Park", 106, 22);
		list.add(s6);
		Student s7 = new Student("Yun", 107, 25);
		list.add(s7);
		Student s8 = new Student("Bu", 108, 22);
		list.add(s8);
		Student s9 = new Student("Jeon", 109, 21);
		list.add(s9);
		Student s10 = new Student("Kwak", 110, 24);
		list.add(s10);
		
		Collections.sort(list);
		for(Student s: list)
			System.out.println(s.toString());
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("\nStudent List (reverse ordered by name)");
		for(Student s: list)
			System.out.println(s.toString());
		
	}

}
