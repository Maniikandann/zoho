package combinedassignment9;

import java.util.ArrayList;
import java.util.List;

public class SimpleProdecureConsumer {
	private static final int BUFFER_CAPACITY = 5;
	private static List<Integer> buffer = new ArrayList<>();

	public static void main(String[] args) {
		Thread producerThread = new Thread(() -> {
			int item = 1;
			while (true) {
				try {
					produce(item++);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread consumerThread = new Thread(() -> {
			while (true) {
				try {
					int item = consume();
					process(item);
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		producerThread.start();
		consumerThread.start();
	}

	private static void produce(int item) throws InterruptedException {
		synchronized (buffer) {
			while (buffer.size() == BUFFER_CAPACITY) {
				System.out.println("Buffer is full. Producer is waiting...");
				buffer.wait();
			}
			buffer.add(item);
			System.out.println("Produced: " + item);
			buffer.notifyAll();
		}
	}

	private static int consume() throws InterruptedException {
		synchronized (buffer) {
			while (buffer.isEmpty()) {
				System.out.println("Buffer is empty. Consumer is waiting...");
				buffer.wait();
			}
			int item = buffer.remove(0);
			buffer.notifyAll();
			return item;
		}
	}

	private static void process(int item) {
		System.out.println("Consumed and processed: " + item);
	}
}
