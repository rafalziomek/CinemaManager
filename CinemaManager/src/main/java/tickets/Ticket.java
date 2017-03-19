package tickets;
import hall.*;

import java.util.ArrayList;
import java.util.Date;

import films.*;
public abstract class Ticket {
	private Projection projection;
	private Seat seat;
	protected int price;
	protected String typeDescription;
	protected ArrayList extras = new ArrayList();
 
	public void setProjection(Projection projection) {
		this.projection = projection;
	}
	public void setSeat(Seat seat){
		this.seat = seat;
	}
	
	@Override
	public String toString()  {
		Film film = projection.getFilm();
		CinemaHall cinemaHall = projection.getCinemaHall();
		Date start = projection.getStartProjection();
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
