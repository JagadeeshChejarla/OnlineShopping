package JavaConcepts;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	private int rollno;
	private String studentName;
	private int studentAge;
	public Student(int rollno, String studentName, int studentAge) {
		super();
		this.rollno = rollno;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}
	@Override
	public int compareTo(Student s) {
		int compareRollNo =((Student) s).getRollno();
		return this.studentAge-compareRollNo;
	}
	
	public static Comparator<Student> sortByName = new Comparator<Student>() {
		public int compare (Student s1, Student s2) {
			String sn1 = s1.getStudentName().toUpperCase();
			String sn2 = s2.getStudentName().toUpperCase();
			return sn1.compareTo(sn2);
		}
	};
	

}
