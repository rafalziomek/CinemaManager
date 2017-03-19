package manager;

import films.Film;
import films.OldFilm;
import hall.*;
import tickets.Ticket;
import tickets.TicketWindow;
import users.User;

import java.util.Date;
import java.util.List;

import booking.BookHall;
import enums.TicketType;
public class CinemaManager {

	public static void main(String[] args) {
		User customer = new User("Rafal","Ziomek");
		TicketWindow ticketWindow = new TicketWindow();
		Film film = new OldFilm("Mechaniczna Pomarancza");
		Date date = new Date();
		CinemaHall cinemaHall = new SmallHall("Small Hall 1");
		BookHall bookHall = new BookHall(cinemaHall, date);
		Projection projection = new Projection(film, bookHall);
		Seat seat = new Seat(0,4);
		customer.addTicket(ticketWindow.orderTicket(projection,seat,TicketType.HALFFARE));
		List<Ticket> customerTickets = customer.getTickets();
		for(Ticket ticket : customerTickets) {
			System.out.println(ticket.toString());
		}
	}


}
