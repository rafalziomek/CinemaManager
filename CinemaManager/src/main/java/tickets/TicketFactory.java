package tickets;
import enums.*;
import films.Film;
import hall.Projection;
import hall.Seat;
public abstract class TicketFactory {
	
	public Ticket orderTicket(Projection projection, Seat seat){
		Ticket ticket = null;
		if(!seat.isBooked())
		{
			seat.Book();
			Film film = projection.getFilm();
			TicketType ticketType = film.getTicketType();
			ticket = createTicket(ticketType);
			ticket.setProjection(projection);
			ticket.setSeat(seat);
		}
		return ticket;
	}
	protected abstract Ticket createTicket(TicketType ticketType);
}
