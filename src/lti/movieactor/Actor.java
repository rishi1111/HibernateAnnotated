package lti.movieactor;

public class Actor {

	private int actorId;
	private String actorName;
	private Movie movie;
	
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Actor(String actorName, Movie movie) {
		
		this.actorName = actorName;
		this.movie = movie;
	}
	public Actor() {
		// TODO Auto-generated constructor stub
	}
	
}
