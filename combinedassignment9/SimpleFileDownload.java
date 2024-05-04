package combinedassignment9;

import java.io.*;
import java.net.*;

public class SimpleFileDownload extends Thread {
	private final String fileUrl;
	private final String destinationPath;
	private volatile boolean running;

	public SimpleFileDownload(String fileUrl, String destinationPath) {
		this.fileUrl = fileUrl;
		this.destinationPath = destinationPath;
		this.running = true;
	}

	public void run() {
		try {

			URL url = new URL(fileUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			int responseCode = connection.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				int fileLength = connection.getContentLength();
				InputStream inputStream = connection.getInputStream();

				File outputFile = new File(destinationPath);
				FileOutputStream outputStream = new FileOutputStream(outputFile);

				byte[] buffer = new byte[1024];
				int bytesRead;
				int totalBytesRead = 0;

				while ((bytesRead = inputStream.read(buffer)) != -1 && running) {
					outputStream.write(buffer, 0, bytesRead);
					totalBytesRead += bytesRead;

					double progress = (double) totalBytesRead / fileLength * 100;
					System.out.printf("Downloading... %.2f%% complete%n", progress);
				}

				outputStream.close();
				inputStream.close();
				System.out.println("Download completed successfully.");
			} else {
				System.out.println("Server returned HTTP error code: " + responseCode);
			}
		} catch (IOException e) {
			System.out.println("Error downloading the file: " + e.getMessage());
		}
	}

	public void stopDownload() {
		running = false;
		interrupt();
	}

	public static void main(String[] args) {
		String fileUrl = "https://e0.pxfuel.com/wallpapers/319/950/desktop-wallpaper-master-vijay-vijay-thalapathy.jpg";
		String destinationPath = "downloaded-file.jpg";

		SimpleFileDownload downloader = new SimpleFileDownload(fileUrl, destinationPath);
		downloader.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		downloader.stopDownload();
	}
}
