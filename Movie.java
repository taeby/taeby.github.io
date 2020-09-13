public class Movie{
	public String title;
	public String director;
	public String production;
	
	public Movie(String title, String director, String production){
		this.title = title;
		this.director = director;
		this.production = production;
	}
	public Movie(){
		this("Avatar", "James Cameron", "Weta Workshop");
	}
}