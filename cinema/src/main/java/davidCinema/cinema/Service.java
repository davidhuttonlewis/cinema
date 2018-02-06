package davidCinema.cinema;


import java.util.HashMap;

public class Service {
	
	static int idCounter = 3;
	//ArrayList<Movie> arrayList = new ArrayList<Movie>();
	private HashMap <Integer, Movie> movieMap = new HashMap<>();
	
public void setUpMovies() {
	
	
	movieMap.put(1, new Movie("Stargate", "Sci-fi", "A12"));
	movieMap.put(2, new Movie("Transformers", "Death of my Childhood", "E"));
	movieMap.put(3, new Movie("Some Movie", "Don't care", "18"));
	
}

public Movie retiveMovie(int key) {
	
	return movieMap.get(key);

}

public void addMovie(String title, String genre, String ageRating) {
	
	idCounter += 1;
	movieMap.put(idCounter, new Movie(title, genre, ageRating));
	
}



}
