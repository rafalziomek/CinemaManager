package tickets;

import enums.FilmType;
import enums.TicketType;

public class TicketWindow extends TicketFactory {
	
	@Override
	protected Ticket createTicket(TicketType ticketType, FilmType filmType) {
		if(filmType.equals(FilmType.NEW) && ticketType.equals(TicketType.HALFFARE)) {
			return new NewFilmHalfFareTicket();
		} else if(filmType.equals(FilmType.OLD) && ticketType.equals(TicketType.HALFFARE)) {
			return new OldFilmHalfFareTicket();
		} else if(filmType.equals(FilmType.NEW) && ticketType.equals(TicketType.NORMAL)) {
			return new NewFilmNormalTicket();
		} else if(filmType.equals(FilmType.OLD) && ticketType.equals(TicketType.NORMAL)) {
			return new OldFilmNormalTicket();
		} else 
			return null;
		
	}

}
