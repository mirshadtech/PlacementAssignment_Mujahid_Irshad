package in.ineuron.Question1;

public class Rectangle implements Shape {

	@Override
	public float area() {

		int L = 4, B = 3, H = 2;
		return L * B * H;
	}

	@Override
	public float perimeter() {
		int L = 2, W = 3;
		return 2 * (L + W);
	}

}
