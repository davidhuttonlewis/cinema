package davidCinema.cinema;

public class Main {

	public static void main(String[] args) {
		Service service1 = new Service();

		service1.setUpMovies();
		System.out.println(service1.retiveMovie(1));
		service1.addMovie("Lion King", "Something", "E");
		System.out.println(service1.retiveMovie(4));
		System.out.println(service1.convertToJson(2));

	}

}
