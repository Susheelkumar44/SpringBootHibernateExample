package org.arpit.java2blog.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.arpit.java2blog.model.Flights;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class FlightDaoImpl implements FlightDao {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	private List<Flights> flist;

    public void setSessionFactory(SessionFactory sf) {
           this.sessionFactory = sf;
    }

    @Transactional
    public List<Flights> getAllFlights() {
           Session session = this.sessionFactory.getCurrentSession();
           List<Flights>  flightList = session.createQuery("from Flights").list();
           System.out.println(flightList);
           return flightList;
    }
    
    public List<Flights> getFlights(){
    	return flist;
    }
    
    /*public List<Flights> getSearchResults(){
    	Session session = this.sessionFactory.getCurrentSession();
    	String source = request
    	String hql = "from flights where source=?, destination=?, departdate=?";
    	
    	List<Flights> searchList = s
    }*/
    
    private int id;
    
    Connection connection = null;
    
    public void connectDB() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "gagan", "root");
	
	}	
    public boolean findBySource(String source)
	{
		try
	    {
			 connectDB();
			 Statement statement = connection.createStatement();
			 ResultSet resultSet = statement.executeQuery("SELECT source FROM FLIGHTS where flightid='"+id+"'");
	         while (resultSet.next())
	         {
	        	 if((source.equalsIgnoreCase(resultSet.getString("source"))) )
	            {
	            	return true;
	            }  

	         }
	       return false;	        
	    } 
		catch(Exception exception)
	    {
	        System.out.println("Error!!");

	    }
		return false;
	}
	
	
	
	public boolean findByDestination(String destination)
	{
	try
    {
		 connectDB();
		 Statement statement = connection.createStatement();
		 ResultSet resultSet = statement.executeQuery("SELECT destination FROM FLIGHTS where flightid='"+id+"'");
        while (resultSet.next())
        {
            if((destination.equalsIgnoreCase(resultSet.getString("destination"))) )
            {
            	return true;
            }  

        }
        return false;	        
    } 
	catch(Exception exception)
    {
        System.out.println("Error!!");

    }
	return false;
	}
	
	public boolean findByDate(String departDate)
	{
	try
    {
		 connectDB();
		 Statement statement = connection.createStatement();
		 ResultSet resultSet = statement.executeQuery("SELECT departdate FROM FLIGHTS where flightid='"+id+"'");
        while (resultSet.next())
        {
            if((departDate.equals(resultSet.getString("departdate"))) )
            {
            	return true;
            }  

        }
        return false;	        
    } 
	catch(Exception exception)
    {
        System.out.println("Error!!");

    }
	return false;
	}
	
	
	
	/*public double findByClass(String classType,String journeyDate)
	{
		try
	    {
			 connectDB();
			 Statement statement = connection.createStatement();
			 if(classType.equalsIgnoreCase("Economy"))
			 {
				 ResultSet resultSet = statement.executeQuery("SELECT economySeats,economyFare FROM FLIGHTLIST where journeyDate='"+journeyDate+"' and flightId='"+id+"'");
				 while(resultSet.next())
				 {
					 if(noOfSeats<=(resultSet.getInt("economySeats")))
						 return (resultSet.getDouble("economyFare"));
				 }
			 }
			 else if(classType.equalsIgnoreCase("Business"))
			 {
				 ResultSet resultSet = statement.executeQuery("SELECT businessSeats,businessFare FROM FLIGHTLIST where journeyDate='"+journeyDate+"' and flightId='"+id+"'");
				 while(resultSet.next())
				 {
					 if(noOfSeats<=(resultSet.getInt("businessSeats")))
						 return(resultSet.getDouble("businessFare"));
				 }
			 }
			
	    }
		catch(Exception exception)
	    {
	        System.out.println("Error!!");
	    }
		return 0;
	}*/
		
	public List<Flights> availableFlights(String source,String destination,String departDate)
	{
		List<Flights> flights=new ArrayList<Flights>();
		try
	    {
			 connectDB();
			 Statement statement = connection.createStatement();
			 ResultSet resultSet = statement.executeQuery("SELECT * FROM FLIGHTS");
			 while (resultSet.next())
	         {
				 id=resultSet.getInt("flightid");
				 boolean isSource=findBySource(source);
				 /*System.out.println(isSource);*/
	        	 boolean isDestination=findByDestination(destination);
	        	 /*System.out.println(isDestination);*/
	        	 boolean isDate=findByDate(departDate);
	        	 //double fare=findByClass(classType,seats,journeyDate);
	        	 if(isSource==true && isDestination==true && isDate==true)
	        	 {
	        		  String company=resultSet.getString("flightname");
		        	  String at=resultSet.getString("arrival");
		        	  String dt=resultSet.getString("departure");
		        	  double price=resultSet.getDouble("price");
/*		        	  String src=resultSet.getString("source");
		        	  String dst=resultSet.getString("destination");*/
		        	  flights.add(new Flights(company,dt,at,price));	        		 		 
	        	 }	        	
	          }			
	    }
		catch(Exception exception)
	    {
	        System.out.println("Error!!");
	    }
		return flights;
	}	
}
