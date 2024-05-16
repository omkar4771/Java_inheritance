package inheritance;
import java.util.*;
class Movie
{
	String title;
	int amount,nticket;
	Movie(String title,int amount,int nticket)
	{
		this.title=title;
		this.amount=amount;
		this.nticket=nticket;
	}
	void display()
	{
		System.out.println("Movie Title - "+title);
		System.out.println("Movie Amount - "+amount);
		System.out.println("Movie Ticket - "+nticket);
	}
}
class TaxedMovie extends Movie
{	
	
	double tax,tax1,famount;
	TaxedMovie(String title,int amount,int nticket,double tax)
	{
		super(title,amount,nticket);
		this.tax=tax;
	}
	void TicketAmount()
	{
		tax1=amount/tax;
		famount=amount-tax1;
		System.out.println("Final Amount - "+famount);
	}
}
class TaxFreeMovie extends Movie
{
	double famount;
	TaxFreeMovie(String title,int amount,int nticket)
	{
		super(title,amount,nticket);
	}
	void TicketAmount()
	{
		System.out.println("Final Amount - "+amount);
	}	
}
public class Movie_Demo
{
	public static void main(String[] args) 
	{
		String title;
		int amount,nticket,ch;
		double tax;

		Scanner sc=new Scanner (System.in);

		System.out.println(" 1 : Tax Movie");
		System.out.println(" 2 : Tax Free Movie");
		System.out.println(" 3 : Exit");

		ch=sc.nextInt();

		switch(ch)
	{
		case 1:
			System.out.println("Enter Movie title, amount,no of ticket & tax ");
			title=sc.next();
			amount=sc.nextInt();
			nticket=sc.nextInt();
			tax=sc.nextDouble();
			TaxedMovie t=new TaxedMovie(title,amount,nticket,tax);
			t.display();
			t.TicketAmount();
			break;

		case 2:
			System.out.println("Enter Movie title, amount,no of ticket");
			title=sc.next();
			amount=sc.nextInt();
			nticket=sc.nextInt();
			TaxFreeMovie t1=new TaxFreeMovie(title,amount,nticket);
			t1.display();
			t1.TicketAmount();
			break;
		case 3:
			System.exit(0);
			break;
		default : System.out.println("Enter correct choice");
		break;
	}
	}
}

