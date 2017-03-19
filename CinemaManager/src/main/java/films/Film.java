package films;

import enums.TicketType;

public class Film {
	private String title;
	private TicketType ticketType;
	private int duration;
	public Film(String title, TicketType ticketType){
		this.title = title;
		this.ticketType = ticketType;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public TicketType getTicketType() {
		return ticketType;
	}
	public void setTicketType(TicketType ticketType) {
		this.ticketType = ticketType;
	}
}
