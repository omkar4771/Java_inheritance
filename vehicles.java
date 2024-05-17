package inheritance;
import java.util.*;
class vehicle
{
	String company;
	double price;
	vehicle(String company,double price)
	{
		this.company=company;
		this.price=price;
	}
	void display()
	{
		System.out.println("vehicle company = "+company);
		System.out.println("vehicle price = "+price);
	}
}
class Light_motar_vehicle extends vehicle
{
	int member;
	double mileage;
	Light_motar_vehicle(String company,double price,int member,double mileage)
	{
		super(company,price);
		this.member=member;
		this.mileage=mileage;
	}
	void display1()
	{
		System.out.println("Vehicle member = "+member);
		System.out.println("Vehicle mileage = "+mileage);
	}
}
class Heavy_motar_vehicle extends vehicle
{
	int member;
	double capacity;
	Heavy_motar_vehicle(String company,double price,int member,double capacity)
	{
		super(company,price);
		this.member=member;
		this.capacity=capacity;
	}
	void display1()
	{
		System.out.println("Vehicle member ="+member);
		System.out.println("Vehicle capacity = "+capacity+"tons");
	}
}
public class vehicles 
{
	public static void main(String[] args)
	{
		int member,ch,n,i;
		double price,mileage,capacity;
		String company;
		Scanner sc= new Scanner(System.in);
	
			
			System.out.println("1 : Light Motar Vehicle");
			System.out.println("2 : Heavy Motar Vehicle");
			System.out.println("3 : Exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			
			switch(ch)
		{
			case 1:
				System.out.print("How many entry u put here");
				n=sc.nextInt();
				Light_motar_vehicle L[]= new Light_motar_vehicle[n];
				for(i=0;i<=n;i++)
				{
					System.out.println("Enter Company, price, Member, Mileage");
					company=sc.next();
					price=sc.nextDouble();
					member=sc.nextInt();
					mileage=sc.nextDouble();
					L[i]=new Light_motar_vehicle(company,price,member,mileage);
					L[i].display();
					L[i].display1();
					
				}
				break;
				
			case 2:
				System.out.print("How many entry u put here");
				n=sc.nextInt();
				Heavy_motar_vehicle M[]= new Heavy_motar_vehicle[n];
				for(i=0;i<=n;i++)
				{
				System.out.println("Enter Company, price, Member, Capacity");
				company=sc.next();
				price=sc.nextDouble();
				member=sc.nextInt();
				capacity=sc.nextDouble();
				M[i]=new Heavy_motar_vehicle(company,price,member,capacity);	
				M[i].display();
				M[i].display1();
				
				}
				break;
			case 3:
				System.exit(0);
				break;
			
			default:
				System.out.println("Invalid choice");	
		}	
	}
}
