package in.ineuron.Question9;

public class Consumer implements Runnable {
	private MyUtil utility;
	private Integer total = 0;

	public Consumer(MyUtil utility) {
		this.utility = utility;
		Thread thread = new Thread(this, "consumer");
		thread.start();
	}

	@Override
	public void run() {

		try {
			while (utility.getQueue().size() <= utility.getQueueCapacity()) {
				Integer num = utility.get();
				total = total + num;
				System.out.println("In consumer Number is :: " + num);
				System.out.println("Total is::  " + total);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

}
