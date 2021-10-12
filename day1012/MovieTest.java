class Movie{
	private String name;
	private String director;
	private String manufacturer;
	
	public String toString(){
		return "영화의 제목은 " +name+" 영화의 감독은 "+director+" 제작사는 "+manufacturer;
	}

	public Movie(){
		this.name = "해리포터";
		this.director = "크리스 콜럼버스";
		this.manufacturer = "유니버셜스투디오";
	}

	public Movie(String name, String director , String manufacturer){
		this.name = name;
		this.director = director;
		this.manufacturer = manufacturer;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public void setDirector(String director){
		this.director = director;
	}
	public String getDirector(){
		return director;
	}
	
	public void setManufacturer(String manufacturer){
		this.manufacturer = manufacturer;
	}
	public String getManufacturer(){
		return manufacturer;
	}

}

class MovieTest 
{
	public static void main(String[] args) 
	{	
		Movie m1 = new Movie();
		System.out.println(m1);
		
		Movie m2 = new Movie("괴물","봉준호","청어람");
		System.out.println(m2);
	}
}
