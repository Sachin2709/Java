package student;

public class TestStudent {
	public static void main(String[] arg) {
		Student student1 = new Student(153,"Rohit", "AI", 'C'); // parameterize contructor
		Student student2 = new Student(); // default constructor
		Student student3 = new Student(student1); //copy constructor
		HostelStudent hs = new HostelStudent(1,"Priya","AI-ML","g",80,"H506");

		regularStudent rs = new regularStudent(153,"Priya", "AI", 'G',80,"H506");
//		rs.displayInfo();
//		rs.payfee();
		System.out.println(hs.Name);
		
		
		
		
		
		
		
// 		student1.Department="AI";
//		student1.Name="Rohit";
//		student1.Roll_Number=153;
//		student1.section='C';	
//		student1.No_of_hours=8;
//		student1.displayInfo();
//		student1.studying(5);
//		student2.displayInfo();
//		Student.CollegeName="IIT";
//		student1.College_Name="NIT";
//		student1.displayInfo();
//		student2.displayInfo();
//		//student1.Name="priya"; // cannot access the private variable
//		student1.Department = "AI";
	
		
	}

}
