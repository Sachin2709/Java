package exam;
import student.Student;

public class ExampleStudentexam extends Student {
	public static void main(String args[]) {
		Student s1 = new Student(5,"Priya","AIML",'C');
		ExampleStudentexam obj = new ExampleStudentexam();
		obj.Department ="CS";
		s1.RollNumber =2;
		obj.displayInfo();
		obj.Section = 'C';

	}
}