package combinedassignment5;

interface musicPlayer {
	void play() ;

	void pause();

	void stop();
}

class MP3Player implements musicPlayer {
	public void play() {
		System.out.println("MP3 player: Playing music");
	}

	public void pause() {
		System.out.println("MP3 player: Pausing music");
	}

	public void stop() {
		System.out.println("MP3 player: Stopping music");
	}
}

class CDPlayer implements musicPlayer {

	public void play() {
		System.out.println("CD player: Playing music");
	}

	public void pause() {
		System.out.println("CD player: Pausing music");
	}

	public void stop() {
		System.out.println("CD player: Stopping music");
	}
}

class StreamingPlayer implements musicPlayer {

	public void play() {
		System.out.println("Streaming player: Playing music");
	}

	public void pause() {
		System.out.println("Streaming player: Pausing music");
	}

	public void stop() {
		System.out.println("Streaming player: Stopping music");
	}
}

public class Interface {
	public static void main(String[] args) {

		musicPlayer mp3Player = new MP3Player();
		musicPlayer cdPlayer = new CDPlayer();
		musicPlayer streamingPlayer = new StreamingPlayer();

		mp3Player.play();
		mp3Player.pause();
		mp3Player.stop();
		System.out.println("\n");
		
		cdPlayer.play();
		cdPlayer.pause();
		cdPlayer.stop();
		System.out.println("\n");

		streamingPlayer.play();
		streamingPlayer.pause();
		streamingPlayer.stop();
	}
}
