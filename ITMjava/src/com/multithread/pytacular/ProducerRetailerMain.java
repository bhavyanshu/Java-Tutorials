package com.multithread.pytacular;

/**
 * @author Bhavyanshu Parasher
 *
 */

import com.multithread.pytacular.*;

public class ProducerRetailerMain {
	public static void main(String args[]) {
		Producer samsung = new Producer(1000,5);
		Retailer store = new Retailer(5,1000);
		Thread prodthread = new Thread(samsung);
		Thread retailthread = new Thread(store);
		System.out.println("Starting Program");
		retailthread.start();
		prodthread.start();
	}
}