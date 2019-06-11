/**
 * 
 */
package com.jn.edu;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author
 *
 */
public class Consumer implements Runnable {
	ConcurrentLinkedQueue<TransactionItem> theQueue;

	public Consumer(ConcurrentLinkedQueue<TransactionItem> theQueue) {
		this.theQueue = theQueue;
	}

	public void run() {
		try {
			boolean isRunning = true;
			while (isRunning) {
				if (theQueue.size() > 0) { // if there is something on the queue, act on it
					TransactionItem ti = theQueue.remove();
					if (ti.name.equals("END"))
						isRunning = false;
					else { // we have a transaction to process: for now, just print to screen. Next, apply
							// to databasae
						System.out.println("Transaction- Item: " + ti.getName() + "; Quantity: " + ti.getQty());
					}
				} else { // else wait
					Thread.sleep(1000);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Successfully consumed queue");
	}
}
