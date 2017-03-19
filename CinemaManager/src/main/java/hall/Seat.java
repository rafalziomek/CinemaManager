package hall;

public class Seat implements BookableSeat {
	private boolean isBooked;
	private int row;
	private int column;
	
	public Seat(int row, int column) {
		this.row = row + 1;
		this.column = column + 1;
	}
	public boolean isBooked() {
		return isBooked;
	}
	public boolean Book() {
		if(!isBooked)
		{
			isBooked = true;
			return isBooked;
		} else {
			return false;
		}
	}
	public boolean unBook() {
		isBooked = false;
		return isBooked;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public boolean isBookable() {
		return true;
	}
	
	
}
