package inheritance;
import java.util.*;
class Student
{
	int id;
	String name;
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println("Student id = "+id);
		System.out.println("Student name = "+name);
	}
}
class Marks extends Student
{
	int m1,m2,m3;
	Marks(int id,String name,int m1,int m2,int m3)
	{
		super(id,name);
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	void show()
	{	
		display();
		System.out.println("Student sub 1 Marks ="+m1);
		System.out.println("Student sub 2 Marks ="+m2);
		System.out.println("Student sub 3 Marks ="+m3);
	}
}
class result extends Marks
{	
	int total;
	float per;
	result(int id,String name,int m1,int m2,int m3)
	{
		super(id,name,m1,m2,m3);
	}
	void cal_result()
	{	
		show();
		total=m1+m2+m3;
		per=total/3;
		System.out.println("Student Total Marks = "+total);
		System.out.println("Percentage = "+per);
	}
	void cal_class()
	{	
		cal_result();
		if(m1>=40 && m2>=40 && m3>=40)
		{
			if(per>=70 && per<=100)
			{
				System.out.println("Student result = Distinction");
			}
			else if(per>=60 && per<=70)
			{
				System.out.println("Student result = First Class");
			}
			else if(per>=55 && per<=60)
			{
				System.out.println("Student result = Higher Class");
			}
			else if(per>=50 && per<=55) 
			{
				System.out.println("Student result = Second Class");
			}
			else if(per>=40 && per<=50)
			{
				System.out.println("Student result = Pass");
			}
		}
		else if(m1<=40 && m2<=40 && m3<=40)
		{
			System.out.println("Student result = Fail");
		}
		else
		{
			System.out.println("Student result = ATKT");
		}
	}
}
public class Stud_result 
{
	public static void main(String[] args) 
	{
		int id,m1,m2,m3;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student id & name :");
		id=sc.nextInt();
		name=sc.next();
		System.out.print("Enter 3 sub Marks :");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		result r = new result(id,name,m1,m2,m3);
		r.cal_class();
	}
}
