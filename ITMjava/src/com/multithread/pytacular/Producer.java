package com.multithread.pytacular;

/**
 * @author Bhavyanshu Parasher
 *
 */
public class Producer implements Runnable {
	
	
	private int production_time;
	private int threshold;
	
	public Producer(int production_time, int threshold) {
		this.production_time = production_time;
		this.threshold = threshold;
	}
	
	public void run() {
		while(true){
			produce(production_time,threshold);
		}
	}
	
	public synchronized void produce(int time_to_produce, int limit_to_produce) {
		try {
				for(int i=0;i<limit_to_produce;i++){
					System.out.println("Producing item: "+i);
				}
				Thread.sleep(time_to_produce);
				System.out.println("Done producing, passing to retailer thread");
		}
		catch(InterruptedException e){
			System.out.println("Interrupted");
		}
	}
}
