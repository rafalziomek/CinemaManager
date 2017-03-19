package tickets;
import hall.*;

import java.util.ArrayList;
import java.util.Date;

import films.*;
public abstract class Ticket {
	private Projection projection;
	private Seat seat;
	private Film film;
	private CinemaHall cinemaHall;
	private Date start;
	protected int price;
	protected String typeDescription;

	public void setProjection(Projection projection) {
		this.projection = projection;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	
	public Projection getProjection() {
		return projection;
	}

	public Seat getSeat() {
		return seat;
	}

	public Film getFilm() {
		return film;
	}

	public CinemaHall getCinemaHall() {
		return cinemaHall;
	}

	public Date getStart() {
		return start;
	}

	public int getPrice() {
		return price;
	}

	public String getTypeDescription() {
		return typeDescription;
	}

	@Override
	public String toString()  {
		film = projection.getFilm();
		start = projection.getStartProjection();
		cinemaHall = projection.getCinemaHall();
		StringBuffer descriptionTicket = new StringBuffer();
		
		descriptionTicket.append("---------" + typeDescription + " ticket---------\n");
		descriptionTicket.append("Title: " + film.getTitle() + " \n");
		descriptionTicket.append("Start Time: " + start.toString() + "\n");
		descriptionTicket.append("Price: " + price + "\n");
		descriptionTicket.append("Hall: " + cinemaHall.toString() + "\n");
		descriptionTicket.append("Row: " + seat.getRow() + " Column: " + seat.getColumn() + " \n");
		
		return descriptionTicket.toString();
	}
	
	
}
