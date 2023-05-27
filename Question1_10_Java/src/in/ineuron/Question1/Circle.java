package in.ineuron.Question1;

class Circle implements Shape {

	@Override
	public float area() {
		int r = 2;
		return (float) (Math.PI * r * r);
	}

	@Override
	public float perimeter() {
		int r = 2;
		float area = (float) (2 * Math.PI * r);
		return area;
	}

}
