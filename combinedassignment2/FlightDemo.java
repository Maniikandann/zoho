package combinedassignment2;

class FlightDTO {

	private String flightNumber;
	private String origin;
	private String destination;
	private int capacity;
	private int bookedSeats;

	private static int totalFlights = 0;

	public FlightDTO(String flightNumber, String origin, String destination, int capacity) {
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.capacity = capacity;
		this.bookedSeats = 0;
		totalFlights++;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public String getOrigin() {
		return origin;
	}

	public String getDestination() {
		return destination;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getBookedSeats() {
		return bookedSeats;
	}

	public boolean hasAvailableSeats() {
		return bookedSeats < capacity;
	}

	public boolean bookSeat() {
		if (hasAvailableSeats()) {
			bookedSeats++;
			return true;
		} else {
			return false;
		}
	}

	public static int getTotalFlights() {
		return totalFlights;
	}

	static void show(FlightDTO flight) {
		System.out.println("Flight Number: " + flight.getFlightNumber());
		System.out.println("Origin: " + flight.getOrigin());
		System.out.println("Destination: " + flight.getDestination());
		System.out.println("Capacity: " + flight.getCapacity());
		System.out.println("Booked Seats: " + flight.getBookedSeats());
		System.out.println("Available Seats: " + (flight.getCapacity() - flight.getBookedSeats()));
	}
}

public class FlightDemo {
	public static void main(String[] args) {
		FlightDTO flight1 = new FlightDTO("FL123", "JFK", "LAX", 200);
		FlightDTO flight2 = new FlightDTO("FL456", "LAX", "ORD", 150);
		System.out.println("Flight 1:");
		FlightDTO.show(flight1);
		System.out.println();

		System.out.println("Flight 2:");
		FlightDTO.show(flight2);
		System.out.println();
		System.out.println("Booking a seat for Flight 1: " + flight1.bookSeat());
		System.out.println("Booking a seat for Flight 1: " + flight1.bookSeat());
		System.out.println("Booking a seat for Flight 2: " + flight2.bookSeat());

		System.out.println("Updated Flight 1:");
		FlightDTO.show(flight1);
		System.out.println();

		System.out.println("Updated Flight 2:");
		FlightDTO.show(flight2);
		System.out.println();

		System.out.println("Total flights: " + FlightDTO.getTotalFlights());
	}

}
