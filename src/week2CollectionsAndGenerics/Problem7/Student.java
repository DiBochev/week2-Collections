package week2CollectionsAndGenerics.Problem7;

public class Student implements Comparable<Student>{

	private int grade;
	private String name;
	
	public Student(int grade, String name) {
		this.grade = grade;
		this.name = name;
	}
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		if (this.grade - o.grade == 0) {
			return this.name.compareTo(o.name);  
		}
		return grade - o.grade;
	}
	
	
}
