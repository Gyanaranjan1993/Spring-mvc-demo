package com.gyana.collections.demo;

import java.util.concurrent.BlockingQueue;

/*
 * BlockingQueue : implementation in concurrent package
 *                 its waits for queue to become non empty before retrieving elements 
 *                 waits for the queue to become available before adding elements
 */

class Message {

	private String msg;

	public Message(String str) {
		this.msg = str;
	}

	public String getMsg() {
		return msg;
	}

}

public class BlockingQueueDemo implements Runnable {

	private BlockingQueue<Message> queue;

	public BlockingQueueDemo(BlockingQueue<Message> q) {
		this.queue = q;
	}

	@Override
	public void run() {
		// produce messages
		for (int i = 0; i < 100; i++) {
			Message msg = new Message("" + i);
			try {
				Thread.sleep(i);
				queue.put(msg);
				System.out.println("Produced " + msg.getMsg());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// adding exit message
		Message msg = new Message("exit");
		try {
			queue.put(msg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
