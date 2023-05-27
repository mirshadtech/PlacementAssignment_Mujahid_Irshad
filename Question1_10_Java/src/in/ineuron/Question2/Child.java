package in.ineuron.Question2;

class Parent {

	Parent() {
		System.out.println("In Parent class Constructor");
	}

}

public class Child extends Parent {

	Child() {

		super();
		System.out.println("Back In Child Class Constructor..");

	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Child obj = new Child();
	}
}
