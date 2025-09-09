package exam;

//public abstract class Assessment {
//	abstract void MSE1();//abstract method
//	abstract void MSE2();
//	public void CA3() {  //concrete method
//		System.out.println("the attendance will have 3 marks");
//	}
//}

interface Assessment {
	abstract void MSE1();//abstract method
	abstract void MSE2();
	default public void CA3() {  //concrete method
	System.out.println("the attendance will have 3 marks");
	}
}
