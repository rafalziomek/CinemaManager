package hall;

public class SmallHall extends CinemaHall {
	public SmallHall(String name) {
		super(name);
		seats = new Seat[4][4];
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j ++) {
				seats[i][j] = new Seat(i+1,j+1);
			}
		}
	}
	
}
