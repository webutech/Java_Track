package movie;

public class Movie {
	
	private String movieName;
	private int rating;
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		
		if(rating>=0){
			this.rating = rating;
			}
			else{
				throw new RuntimeException("Ratting can not be negative");
			}
		
	}
	public void playMovie(){
		System.out.println(movieName+" is playing : "+rating);
	}

}
