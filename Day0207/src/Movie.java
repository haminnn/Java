public class Movie {
	int year;
	String name;
	
	public Movie() {}
	public Movie(int year, String name) {
		this.year = year;
		this.name = name;
	}
	
	void print() {
		System.out.println(year + ": " + name);
	}
	
	

}
