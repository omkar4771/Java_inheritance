package inheritance;
import java.util.*;
class Emp
{
	Double eid;
	String ename,desg;
	Emp(Double eid,String ename,String desg)
	{
		this.eid=eid;
		this.ename=ename;
		this.desg=desg;
	}
	public void display()
	{
        System.out.println("id:"+eid);
        System.out.println("name :"+ename);
        System.out.println("Designation :"+desg);
	}
}
class part_time extends Emp
{
	Double hr_rate,sal;
	int n_hr;
	part_time(Double eid,String ename,String desg,Double hr_rate,int n_hr)
	{
		super(eid,ename,desg);
		this.hr_rate=hr_rate;
		this.n_hr=n_hr;
	}
	public void cal_sal()
	{
		System.out.println("No of hr:"+n_hr);
        System.out.println("Hr rate:"+hr_rate);
        sal=(n_hr*hr_rate);
        System.out.println("Salary:"+sal);
	}
}
class ful_time extends Emp
{
	double day_rate,sal;
	int n_day;
	ful_time(Double eid,String ename,String desg,Double day_rate,int n_day)
	{
        super(eid,ename,desg);
        this.n_day=n_day;
        this.day_rate=day_rate;       
	}
	public void cal_sal()
	{
		System.out.println("No of hr:"+n_day);
        System.out.println("Hr rate:"+day_rate);
        System.out.println("Salary:"+(n_day*day_rate));
	}
}
public class Emp_part_full_time 
{
	public static void main(String[] args) 
	{
		Double eid,day_rate,hr_rate;
		int n_day,n_hr,ch;
		String ename,desg;
		Scanner sc=new Scanner(System.in);
		do
		{
	        System.out.println("1:Accept details of part time empl");
	        System.out.println("2:Accept details of full time empl");
	        System.out.println("3:Exit");
	        System.out.println("enter u r choice");
	        ch = sc.nextInt();
	        switch(ch)
	        {
	        case 1:
	        	System.out.println("Enter eid,ename & desg,n0f hr,hr rate");
	            eid=sc.nextDouble();
	            ename=sc.next();
	            desg=sc.next();
	            n_hr=sc.nextInt();
	            hr_rate=sc.nextDouble();
	            part_time p1=new part_time(eid,ename,desg,hr_rate,n_hr);
	            p1.display();
	            p1.cal_sal();
	            break;
	            
	        	case 2:
	        		System.out.println("Enter id,name & desg,n0f day,day rate");
	        		eid=sc.nextDouble();
	        		ename=sc.next();
	        		desg=sc.next();
	        		n_day=sc.nextInt();
	        		day_rate=sc.nextDouble();
	        		ful_time f1=new ful_time(eid, ename,desg,day_rate,n_day);
	        		f1.display();
	        		f1.cal_sal();
	        		break;
	        	
	            case 3:
		        	System.exit(0);
		        	break;
		        	default:System.out.println("Invalid choice");
	        }
		}
		while(ch<=3);
	}
}
