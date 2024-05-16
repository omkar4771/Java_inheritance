package inheritance;
import java.util.*;
abstract class area1
{
	abstract void cal_area();
	abstract void cal_volume();
}
class cylinder extends area1
{
	double r,h,A,V;
	cylinder(double r,double h)
	{
		this.r=r;
		this.h=h;
	}

	public void cal_area()
	{
		A=2*3.14*r*h+2*3.14*r*r;
		System.out.println("Cylinder Area = "+A);
	}
	public void cal_volume()
	{
		V=3.14*r*r*h;
		System.out.println("Cylinder Volume = "+V);
	}
}
class sphere extends area1
{
	double r,A,V;
	sphere(double r)
	{
		this.r=r;
	}
	public void cal_area()
	{
		A=4*3.14*r*r;
		System.out.println("Sphere Area = "+A);
	}
	public void cal_volume()
	{
		V=(4/3)*3.14*r*r*r;
		System.out.println("Sphere Volume = "+V);
	}
}
class box extends area1
{
	double l,w,h,A,V;
	box(double l,double w,double h)
	{
		this.l=l;
		this.w=w;
		this.h=h;
	}
	public void cal_area()
	{
		A=2*(l*w+l*h+w*h);
		System.out.println("Box Area = "+A);
	}
	public void cal_volume()
	{
		V=l*w*h;
		System.out.println("Box Volume = "+V);
	}
}
public class Ab_cylinder 
{
	public static void main(String[] args) 
	{
		Double r,h,l,w;
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("1 : Cylinder ");
		System.out.println("2 : Sphere ");
		System.out.println("3 : Box ");
		System.out.println("4 : Exit ");
		System.out.println("Choose given below for Area & Volume ");
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Enter Radius & Height");
			r=sc.nextDouble();
			h=sc.nextDouble();
			cylinder c=new cylinder(r,h);
			c.cal_area();
			c.cal_volume();
			break;
			
		case 2:
			System.out.println("Enter Radius");
			r=sc.nextDouble();
			sphere s=new sphere(r);
			s.cal_area();
			s.cal_volume();
			break;
			
		case 3:
			System.out.println("Enter Length,Weidth & Height");
			l=sc.nextDouble();
			w=sc.nextDouble();
			h=sc.nextDouble();
			box b = new box(l,w,h);
			b.cal_area();
			b.cal_volume();
			
		case 4:
			System.exit(0);
			
		default :
			System.out.println("Enter correct choise");
		}
		
	}

}
