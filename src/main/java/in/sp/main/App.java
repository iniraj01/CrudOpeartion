package in.sp.main;



import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.sp.enitities.User;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter name");
    	String Name=sc.nextLine();
    	System.out.println("Enter Email");
    	String email=sc.nextLine();
    	System.out.println("Enter Password");
    	String pass=sc.nextLine();
    	System.out.println("Enter city");
    	String city=sc.nextLine();
    	
    	User user1 = new User();
    	
    	user1.setName(Name);
    	user1.setEmail(email);
    	user1.setPassword(pass);
    	user1.setCity(city);
    	
    	
    	
    	
       Configuration cfg=new Configuration();
       cfg.configure("/in/sp/config/hibernate.cfg.xml");
       SessionFactory sessionFactory= cfg.buildSessionFactory();
       Session session = sessionFactory.openSession();
       Transaction tranction=((SharedSessionContract) session).beginTransaction();
       try {
       ((Session) session).save(user1);
       tranction.commit();
       }
       catch(Exception e){
    	   tranction.rollback();
       }
    }
}
