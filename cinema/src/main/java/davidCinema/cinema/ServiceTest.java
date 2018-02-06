package davidCinema.cinema;

import org.junit.Test;

import junit.framework.TestCase;

public class ServiceTest extends TestCase {

	@Test
	public void testGenreCount() {
		Service service1 = new Service();
		service1.setUpMovies();
		assertEquals(1, service1.genreCount("Sci-fi"));
	}

}
