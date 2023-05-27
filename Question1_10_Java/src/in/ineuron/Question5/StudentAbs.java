package in.ineuron.Question5;

public class StudentAbs extends Student{

	public static void main(String[] args) {
		
		StudentAbs obj=new StudentAbs();
		obj.add();
		obj.add(10, 40);

	}

	@Override
	public void add() {
		
		System.out.println("Abstract class method... ");
		
	}

}
