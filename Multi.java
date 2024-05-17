package inheritance;
import java.util.*;
class Area
{
	double r,A;
	Area(double r)
	{
		this.r=r;
	}
	void cal_area()
	{
		A=3.14*r*r;
		System.out.println("Area = "+A);
	}
}
class volume extends Area
{	
	double h,v;
	volume(double r,double h)
	{
		super(r);
		this.h=h;
	}
	void cal_volume()
	{	
		cal_area();
		v=A*h;
		System.out.println("Volume = "+v);
	}
}
class volume1 extends volume
{
	double l,v1;
	volume1(double r,double h,double l)
	{
		super(r,h);
		this.l=l;
	}
	void cal_volume1()
	{	
		cal_volume();
		v1=v*l;
		System.out.println("Volume1 = "+v1);
	}
}
public class Multi 
{
	public static void main(String[] args) 
	{
		double r,h,l;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius ,height & length : ");
		r=sc.nextDouble();
		h=sc.nextDouble();
		l=sc.nextDouble();
		volume1 v1= new volume1(r,h,l);
		v1.cal_volume1();
	}
}
