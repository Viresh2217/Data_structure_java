package practies;

import java.util.Scanner;


public class Movie_Review {
	static int i=0;
	public static void main(String[] args)  {
		
      Review[] st=new Review[100];
		
		Scanner s=new Scanner(System.in);
		 while(true)
		 {
			 
			
			 System.out.println("1_Add movie review");
	          System.out.println("2_Show movie reviews");
	                             
	          System.out.println("---------------------------------------------------------------------------------------") ;  
	          System.out.println("Please enter your choice[1--2]");   
	               int choice= s.nextInt();
	                      
	          switch (choice)
	          {                   
	                     case 1: 
	                    	 
        			         st[i]=new Review();
        			         st[i].createReview();
        			         System.out.println("Your review is Stored Sucessfully......!");
        			         System.out.println("Thank....You....!");
        		         	 System.out.println();
        			         ++i;
        			         break;
	                     case 2:
	                    	 System.out.println("Enter a movie name");
	                    	 System.out.println();
	                    	 
	                    	 String mov=s.next();
	                    	     
	                              for(Review op:st)
	                              {
	                            	 
	                            	  if(op == null)
	                            	  {
	                            		  break;
	                            	  }
	                            	  else
	                            	  {
	                            		  op.show(mov);
	                            	  }
	                              }
	                              break;
	                      default:
	                    	  System.out.println("Please enter valid movie name");
	                    	  
	              
	          }
		
		 }
		 
	}

}

class Review{
	private String Moviename;
	private String director;
	private double imdb;
	private String review;
	private String name;
	
	Scanner s=new Scanner(System.in);
	
	void getDetails()
	{
		System.out.println("Movie name:- "+Moviename);
		System.out.println("Director name:- "+director);
		System.out.println("IMDB rating:- "+imdb);
		System.out.println("Openion about moview:- "+review);
		System.out.println("This is review of:- "+name);
		
	}
	
	void createReview()
	{
		System.out.println("Enter a your name");
		name=s.nextLine();
		System.out.println("Enter a movie name");
		Moviename=s.nextLine();
		System.out.println("Enter a movie director name");
		director=s.nextLine();
		System.out.println("Enter a IMDB rating out of 10");
		imdb=s.nextInt();
		System.out.println("Enter your openion: ");
		s.nextLine();
		review=s.nextLine();
	
	}
	void show(String name)
	{
		if(Moviename.equals(name))
		{
			getDetails();
		}
	
	}
	
	
}
