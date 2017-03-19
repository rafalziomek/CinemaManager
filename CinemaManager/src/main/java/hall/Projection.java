package hall;

import java.util.Date;

import booking.BookHall;
import films.Film;

public class Projection {
	private BookHall bookHall;
	private Film film;
	
	
	public Projection(Film film, BookHall bookHall) {
		this.film = film;
		this.bookHall = bookHall;
	}

	public Date getStartProjection() {
		return bookHall.getDate();
	}

	public CinemaHall getCinemaHall() {
		return bookHall.getCinemaHall();
	}

	public Film getFilm() {
		return film;
	}
}
