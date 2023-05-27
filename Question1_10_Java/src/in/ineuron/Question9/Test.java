package in.ineuron.Question9;

public class Test {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {

		MyUtil util = new MyUtil();
		Producer producer = new Producer(util);
		Consumer consumer = new Consumer(util);

	}
}
