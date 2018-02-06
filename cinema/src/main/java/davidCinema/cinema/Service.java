package davidCinema.cinema;

import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Service {

	static int idCounter = 0;
	private ObjectMapper mapper = new ObjectMapper();
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

	public String convertToJson(int id) {

		try {
			return mapper.writeValueAsString(retiveMovie(id));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	public int genreCount(String genre) {
		int count = 0;

		for (int i = 1; i < movieMap.size(); i++) {
			if (movieMap.get(i).getGenre().equalsIgnoreCase(genre)) {
				count++;
			}
		}

		return count;
	}

}
