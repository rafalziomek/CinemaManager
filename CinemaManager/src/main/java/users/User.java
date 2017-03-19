package users;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import tickets.Ticket;
@Entity
public class User {
	private String firstName; 
	private String lastName;
	private List<Ticket> tickets;
	
	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.tickets = new ArrayList<Ticket>();
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<Ticket> getTickets() {
		return tickets;
	}
	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	public void addTicket(Ticket ticket) {
		this.tickets.add(ticket);
	}
}
