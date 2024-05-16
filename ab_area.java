package inheritance;
import java.util.*;
abstract class area
{
	abstract void cal_area();
	abstract void cal_volume();
}
class circle extends area
{
	double r,A,V;
	circle(double r)
	{
		//super();
		this.r=r;
	}
	public void cal_area()
	{
		A=3.14*r*r;
		System.out.println("Area = "+A);
	}
	public void cal_volume()
	{
		V=(4/3)*3.14*r*r;
		System.out.println("Volume = "+V);
	}
}
class cone extends area
{
	double r,h,A,V;
	cone(double r,double h)
	{
		this.r=r;
		this.h=h;
	}
	public void cal_area()
	{
		
	}
	public void cal_volume() {
		
	}
}
public class ab_area
{
	public static void main(String[] args) 
	{
		
	}
}
