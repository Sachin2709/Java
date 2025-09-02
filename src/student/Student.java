package student;

 class Student {
	public int RollNumber;
	private String Name;
	protected String Department;
	char Section;
	static String CollegeName="KIET";
	
	public Student(int RollNumber, String Name, String Branch,char Section ) {
		this.RollNumber = RollNumber;
		this.Name = Name;
		this.Department = Branch;
		this.Section= Section;
	}
	public Student() {
		this.RollNumber = 27;
		this.Name = "unknown";
		this.Department = "AI";
		this.Section= 'C';
	}
	
	public Student(Student student1) {
		this.RollNumber = 127;
		this.Name = "Rohit";
		this.Department = "AI";
		this.Section = 'C';
	}
	public  void Search(int RollNumber) {
		System.out.println("The Roll n0 is"+RollNumber);
}
	
	
	public void studying(int No_of_hours) {
		System.out.println("the student is studying for "+No_of_hours);
	}
	public void playing() {
		System.out.println("Student is playing");
	}
	public void displayInfo() {
		System.out.println("The name of the student is " + Name + "The college name is "+CollegeName);
		System.out.println("The department is "+Department + " the section is "+Section);
	}
	public void payfee() {
		System.out.println("The student "+Name+"has paid the tution fee");
	}
	public static void main(String args[]) {
		Student student1=new Student(1,"Rohit","AI",'C'); //parameterized constructor
		Student student2=new Student();//default constructor
		Student student3 = new Student(student1);
		student1.displayInfo();
		student2.displayInfo();
		Student.CollegeName= "IIT";
		
		
//		student1.Branch="CSE-AI";
//		student1.Name="Rohan";
//		student1.RollNumber=1;
//		student1.Section='C';
		student1.displayInfo();
//		student1.playing();
//		student1.studying(5);
		student2.displayInfo();
		student3.displayInfo();
		
	}

}
