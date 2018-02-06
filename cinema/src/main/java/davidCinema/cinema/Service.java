package davidCinema.cinema;

import java.util.HashMap;

public class Service {

	static int idCounter = 0;

	private HashMap<Integer, Movie> movieMap = new HashMap<>();

	public void setUpMovies() {

		addMovie("Stargate", "Sci-fi", "A12");
		addMovie("Transformers", "Death of my Childhood", "E");
		addMovie("Some Movie", "Don't care", "18");
	}

	public Movie retiveMovie(int key) {

		return movieMap.get(key);
	}

	public void addMovie(String title, String genre, String ageRating) {

		idCounter += 1;
		movieMap.put(idCounter, new Movie(title, genre, ageRating));

	}

}
