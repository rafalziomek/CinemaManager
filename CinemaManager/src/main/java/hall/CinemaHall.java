package hall;

public abstract class CinemaHall {
	String name;
	Seat[][] seats;
	
	public CinemaHall(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}

	public Seat[][] getSeats() {
		return seats;
	}

	
	
}
