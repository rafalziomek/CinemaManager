package hall;

public class NoSeat implements BookableSeat {
	public boolean isBookable() {
		return false;
	}
}
