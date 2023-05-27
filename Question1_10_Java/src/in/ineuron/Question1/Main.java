package in.ineuron.Question1;

public class Main {

	public static void main(String[] args) {
		Shape cir = new Circle();
		Shape rec = new Rectangle();
		System.out.println("Area of Circle::"+cir.area());
		System.out.println("Perimeter of Circle::"+cir.perimeter());
		System.out.println("Area of Rectangle::"+rec.area());
		System.out.println("Perimeter of Rectangle::"+rec.perimeter());

	}

}
