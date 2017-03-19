package tickets;

import enums.TicketType;

public class NewFilmHalfFareTicket extends Ticket {
	public NewFilmHalfFareTicket() {
		price = 15;
		extras.add("coupon");
		typeDescription = TicketType.NEWFILMHALFFARE.toString();
	}
}
