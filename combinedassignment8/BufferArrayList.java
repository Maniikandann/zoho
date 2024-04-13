package combinedassignment8;

import java.util.ArrayList;

public class BufferArrayList {
	private ArrayList<String> buffer;
	private int maxSize;

	public BufferArrayList(int maxSize) {
		this.maxSize = maxSize;
		buffer = new ArrayList<>(maxSize);
	}

	public void addMessage(String message) {
		if (buffer.size() < maxSize) {
			buffer.add(message);
		} else {
			buffer.remove(0);
			buffer.add(message);
		}
	}

	public void displayMessages() {
		if (buffer.isEmpty()) {
			System.out.println("Buffer is empty.");
			return;
		}
		System.out.println("Messages in the buffer:");
		for (String message : buffer) {
			System.out.println(message);
		}
	}

	public static void main(String[] args) {
		BufferArrayList buffer = new BufferArrayList(5); // Create a circular buffer with a maximum size of 5

		buffer.addMessage("Message 1");
		buffer.addMessage("Message 2");
		buffer.addMessage("Message 3");
		buffer.addMessage("Message 4");
		buffer.addMessage("Message 5");
		buffer.addMessage("Message 6");

		buffer.displayMessages();
	}
}
