package Lab2;
abstract class Item{
	private int uid;
	private String title;
	private int no_of_copies;
	public boolean flag;
	public  String getTitle() {
		if(flag==true)
	return title;
		return "You havnt checkIn";	
	}
	public void setTitle(String title)
	{if(flag==true)
		this.title=title;
	}

	public  int getUid() {
		if(flag==true)
		return uid;
		return 0;
		}
		public void setUid(int uid)
		{if(flag==true)
			this.uid=uid;
		}
		
		public int getCopies() {
			if(flag==true)
			return no_of_copies;
			return 0;
			}
			public void setCopies(int no_of_copies)
			{
				if(flag==true)
				this.no_of_copies=no_of_copies;
			}
		
		public Boolean check()
		{
			return true;
		}
		
		public void checkIn()
	{
		
			this.flag=true;
	}
	public void checkOut()
	{
		this.flag=false;
	}
	
	

}
abstract class WrittenItem extends Item{
	private String author_name;
	public String getName()
	{
		if(flag==true)
		return author_name;
		return "You havnt checked in";
	}
	public void setString(String author_name)
	{
		if(flag==true)
		this.author_name=author_name;
	}
}
class Book extends WrittenItem{

//	Book(int id, int no_of_copies, String title) {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
	
}
class JournalPaper extends WrittenItem{

	private int year_published;
//	JournalPaper(int id, int no_of_copies, String title) {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	public void setYear(int year_published)
	{
		if(flag==true)
		this.year_published=year_published;
	}
	public int getYear()
	{
		if(flag==true)
		return year_published;
		return 0;
	}
	
}
abstract class MediaItem extends Item{
	
	private int runtime;
	public void setRuntime(int runtime)
	{
		if(flag==true)
		this.runtime=runtime;
	}
	public int getRuntime()
	{
		if(flag==true)
		return runtime;
		return 0;
	}
	
}
class Cd extends MediaItem{
//
//	Cd(int id, int no_of_copies, String title) {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	private String artist,genre;
	
	public void setGenre(String genre)
	{
		if(flag==true)
		this.genre=genre;
	}
	public String getGenre()
	{
		if(flag==true)
		return genre;
		return "You havnt checked in";
	}
	
	public void setArtist(String artist)
	{
		if(flag==true)
		this.artist=artist;
	}
	public String getArtist()
	{
		if(flag==true)
		return artist;
		return "You havnt checked in";
	}
	
	
}
class Video extends MediaItem{

//	Video(int id, int no_of_copies, String title) {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	private String director,owner,genre;
	private int year_released;
	
	public void setDirector(String director)
	{
		if(flag==true)
		this.director=director;
	}
	public String getDirector()
	{
		if(flag==true)
		return director;
		return "You havnt checked in";
	}
	
	public void setOwner(String owner)
	{
		if(flag==true)
		this.owner=owner;
	}
	public String getOwner()
	{
		if(flag==true)
		return owner;
		return "You havnt checked in";
	}
	
	public void setYear(int year_released)
	{
		if(flag==true)
		this.year_released=year_released;
	}
	public int getYear()
	{
		if(flag==true)
		return year_released;
		return 0;
	}
	
	public void setGenre(String genre)
	{
		if(flag==true)
		this.genre=genre;
	}
	public String getGenre()
	{
		if(flag==true)
		return genre;
		return "You havnt checked in";
	}
	
}
public class Excercise1 {
public static void main(String []args)
{
	Item it=new Cd();
	it.checkIn();
	it.setUid(1);
	it.setTitle("harry");
	System.out.println(it.getTitle());
	System.out.println(it.getUid());
	MediaItem m=new Cd();
	m.setRuntime(45);
	System.out.println(m.getRuntime());
	m.setCopies(20);  
	System.out.println(m.getCopies());    //0 as we havn't checked in
	m.checkIn();
	m.setCopies(20);  
	System.out.println(m.getCopies());    //20 as we checked in
	Cd cd =new Cd();
	cd.setArtist("John");
	cd.setGenre("Romance");
	System.out.println(cd.getArtist());
	System.out.println(cd.getGenre());
	Video vd=new Video();
	vd.checkIn();
	vd.setDirector("Rajamouli");
	vd.setYear(2016);
	vd.setOwner("Salman khan");
	vd.setGenre("Action");
	vd.setTitle("Baahubali");
	vd.setRuntime(150);
	vd.setCopies(5000000);
	System.out.println(vd.getTitle());
	System.out.println(vd.getRuntime());
	System.out.println(vd.getYear());
	System.out.println(vd.getDirector());
	System.out.println(vd.getOwner());
	System.out.println(vd.getGenre());
	System.out.println(vd.getCopies());
	
}
}
