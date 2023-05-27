package in.ineuron.Question5;

public class StudentImpl implements StudentI{

	public static void main(String[] args) {
		
		StudentImpl obj=new StudentImpl();
		obj.sum();
		obj.mul();

	}

	@Override
	public  void sum() {
		int a=10;
		int b=20;
		System.out.println(a+b);
		
	}

	@Override
	public  void mul() {
		int a=10;
		int b=20;
		System.out.println(a*b);
		
		
	}

}
