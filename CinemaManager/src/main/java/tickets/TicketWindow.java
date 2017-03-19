package tickets;

import enums.TicketType;

public class TicketWindow extends TicketFactory {
	
	@Override
	protected Ticket createTicket(TicketType ticketType) {
		if(ticketType.equals(TicketType.NEWFILMHALFFARE)) {
			return new NewFilmHalfFareTicket();
		} else
			return null;
	}

}
