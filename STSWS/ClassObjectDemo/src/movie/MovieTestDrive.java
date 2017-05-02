package movie;

public class MovieTestDrive {

	public static void main(String[] args) {
		Movie movie1=new Movie();
		movie1.setMovieName("Gadar");
		movie1.setRating(5);
		movie1.playMovie();
		
		Movie movie2=new Movie();
		movie2.setMovieName("Jodha Akbar");
		movie2.setRating(-4);
		movie2.playMovie();
		
		Movie movie3=new Movie();
		movie3.setMovieName("Sholy");
		movie3.setRating(9);
	
		movie3.playMovie();
		

	}

}
