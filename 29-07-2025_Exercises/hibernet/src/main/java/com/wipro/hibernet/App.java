package com.wipro.hibernet;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.wipro.methodref.*;
//import com.wipro.hibernatedemo.repo.MovieRepo;
//import com.wipro.hibernet.util.*;
public class App {
	 public static void main( String[] args )
	    {
//	        Session session= HibernetUtil.getSessionFactory().getCurrentSession();
//	    	Transaction transaction=session.beginTransaction();
//	    	Movie m= new Movie("Catch me if you can","English",8.0);   
//	    	session.persist(m);
//	    	transaction.commit();   
		 int choice=0;
	    	do {
	    	System.out.println("--Menu---");
	    	System.out.println("1.--Create Movie---");
	    	System.out.println("2.--Find by Id Movie---");
	    	System.out.println("3.--Update Movie---");
	    	System.out.println("4.--Delete by  id---");
	    	System.out.println("5.--Find All Movies---");
	    	System.out.println("6.--Find All Movie Names---");
	    	System.out.println("7.--Find By Language---");
	    	System.out.println("9.--Exit---");
	    	Scanner sc= new Scanner(System.in);    	
	    	  choice= sc.nextInt();
	    	  
//	    	
//		    	switch(choice)
//		    	{
//		    		case 1:
//		    			MovieRepo.createMovie();
//		    		break;
//		    		case 2:
//		    			System.out.println("Please enter movie id:");
//		    			int id= sc.nextInt();
//		    			Movie m=MovieRepo.findById(id);
//		    			System.out.println(m);
//		    			
//		    		case 3:
//		    			MovieRepo.updateMovie();
//		    			break;
//		    			
//		    		case 4:
//		    			 
//		    			System.out.println("Please enter movie id:");
//		    			int id1= sc.nextInt();
//		    			MovieRepo.deleteById(id1);
//		    			break;
//		    			
//		    		case 5:
//		    			List<Movie> list=MovieRepo.findAll();
//		    			System.out.println(list);
//		    			break;
//		    		case 6:
//		    			List<String> movieNameList=MovieRepo.findAllMovieNames();
//		    			System.out.println(movieNameList);
//		    			break;
//		    		case 7:
//		    			System.out.println("Please enter movie language");
//		    			String language=sc.next();
//		    			List<Movie> listMovies= MovieRepo.findByMovieLanguages(language);
//		    			System.out.println(listMovies);
//		    			break;
//		    		case 9:
//		    			return;
//		    		
//		    		default:
//		    			System.out.println("Invalid option please try again");
//		    			break;
//		    	
//		    	 }
	    
	        	 
	    	}while(choice!=9);
	    }

}
