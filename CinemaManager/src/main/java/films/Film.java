package films;

import enums.FilmType;
import enums.TicketType;

public abstract class Film {
	private String title;
	private int duration;
	protected FilmType filmType;
	public Film(String title){
		this.title = title;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public FilmType getFilmType() {
		return filmType;
	}
}
