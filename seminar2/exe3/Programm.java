package seminar2.exe3;

public class Programm {
	public static void main(String[] args) {
		Runner[] runners = {
				new Cat("barsik", 1500, 300), new Cat("Peach", 1700, 220), new Robot("C3PO", 9999, 0),
				new Robot("R2D2", 5000, 50), new Human("Petya", 2500, 150), new Human("Kilya", 3500, 320)
		};
		Obstacle[] obstacles = {
				new Track(1200),
				new Track(3000),
				new Track(2000),
				new Wall(30),
				new Wall(140),
				new Wall(250),
		};
		for (Runner runner : runners) {
			for (Obstacle obstacle : obstacles) {
				if (obstacle instanceof Wall) {
					if (!runner.jump(obstacle.getHeight())) {
						break;
					}
				} else if (obstacle instanceof Track) {
					if (!runner.run(obstacle.getLength())) {
						break;
					}
				}
			}
		}
	}
}
