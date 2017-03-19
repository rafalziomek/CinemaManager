package booking;



import java.util.Date;

import films.Film;
import hall.CinemaHall;

public class BookHall {
	private CinemaHall cinemaHall;
	private Date date;
	
	
	public BookHall(CinemaHall cinemaHall, Date date) {
		super();
		this.cinemaHall = cinemaHall;
		this.date = date;
	}
	public CinemaHall getCinemaHall() {
		return cinemaHall;
	}
	public void setCinemaHall(CinemaHall cinemaHall) {
		this.cinemaHall = cinemaHall;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
