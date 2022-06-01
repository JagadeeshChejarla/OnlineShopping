package JavaConcepts;

import java.util.*;

public class Sorting1 {

	public static void main(String[] args) {
		List<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(2615,"Jagadeesh",24));
		arrayList.add(new Student(2635,"Auro",24));
		arrayList.add(new Student(2606,"Charan",24));
		arrayList.add(new Student(2604,"Kishore",24));
		Collections.sort(arrayList);
		for(Student s:arrayList) {
			System.out.println(s.getRollno()+":"+s.getStudentName());
		}
		Collections.sort(arrayList, Student.sortByName);
		for(Student s3: arrayList) {
			System.out.println(s3.getStudentName());
		}
	}

	
}
