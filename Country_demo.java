package inheritance;
import java.util.*;
class contient
{
	String contientname;
	contient(String contientname)
	{
		this.contientname=contientname;
		
	}
	void display()
	{
		System.out.println(" contient name - "+contientname);
		
	}
}
class country extends contient
{

	String countryname;
	country(String contientname,String countryname)
	{
		super(contientname);
		this.countryname=countryname;
	}
	void show()
	{
		display();
		System.out.println("country name - "+countryname);
	}
}
class state extends country
{
	
	String place,state;
	state(String contientname,String countryname,String place,String state)
	{
		super(contientname,countryname);
		this.place=place;
		this.state=state;
	}
	void find()
	{
		show();
		System.out.println("Place - "+place);
		System.out.println("State name - "+state);
	}
}
public class Country_demo 
{

	public static void main(String[] args) 
	{
		
		String contientname,countryname,place,state;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter contient,country,place & state name");
		contientname=sc.next();
		countryname=sc.next();
		place=sc.next();
		state=sc.next();
		state s1=new state(contientname,countryname,place,state);
		s1.find();
	}
}
