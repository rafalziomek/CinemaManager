package people;

import java.util.ArrayList;
import java.util.List;

import tickets.Ticket;

public class Customer {
	private String firstName; 
	private String lastName;
	private List<Ticket> tickets;
	
	public Customer (String firstName, String lastName) {
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
