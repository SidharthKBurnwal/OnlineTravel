package com.OnlineTravel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.OnlineTravel.logic.BookNow;
import com.OnlineTravel.logic.TourInfo;


public class BookDAO {
	public boolean insertRecord(BookNow bobj)
	{
		boolean f = false;
		PreparedStatement pst = null;
		Connection con = null;
		
		try
		{
			con = DBConnection.getMySQlConnection();
			pst = con.prepareStatement("insert into booking values(?,?,?,?,?,?,?,?,?)");
	
			pst.setString(1, bobj.getBookingid());
			pst.setString(2, bobj.getTourid());
			pst.setString(3, bobj.getEmail());
			pst.setString(4, bobj.getName());
			pst.setString(5, bobj.getAge());
			pst.setString(6, bobj.getGender());
			pst.setString(7, bobj.getRoom());
			pst.setString(8, bobj.getFood());
			pst.setString(9, bobj.getPayment());
			
			
			int i =pst.executeUpdate();
			
			if(i > 0)
				f = true;
		}catch(SQLException e){
			e.printStackTrace();
		}
		 finally 
		 {
	   		 if(pst != null)
			 {
				try {
					pst.close();
				} catch (SQLException e) {e.printStackTrace();}
			 }
			
			 if(con != null)
			 {
				try {
					con.close();
				} catch (SQLException e) {e.printStackTrace();}
			 }
		}	
		return f;
	}
	public boolean deleteUserTour(String id)
	{
		boolean f = false;
		PreparedStatement pst = null;
		Connection con = null;
		try
		{
			con = DBConnection.getMySQlConnection();
			pst = con.prepareStatement("delete from booking where bookingid=?");
			
			pst.setString(1, id);
			
			int i =pst.executeUpdate();
			if(i > 0)
			{
				f = true;
			}
		}catch(SQLException e)
			{
				e.printStackTrace();
			}
		 finally 
		 {
	   		 if(pst != null)
			 {
				try {
					pst.close();
				} catch (SQLException e) {e.printStackTrace();}
			 }
			
			 if(con != null)
			 {
				try {
					con.close();
				} catch (SQLException e) {e.printStackTrace();}
			 }
		}
		return f;
	}
	
	
	public boolean updatePayment(String id){
		   
	    boolean f = false;
	    PreparedStatement pst = null;
		Connection con = null;
		
		try{
			con = DBConnection.getMySQlConnection();
			pst = con.prepareStatement("update booking set payment = 'T' where bookingid = ?");

			pst.setString(1, id);
			
			int i = pst.executeUpdate();
			if(i > 0 )
				f = true;;
		}catch(SQLException e){e.printStackTrace();}
		 finally 
		 {
	   		 if(pst != null)
			 {
				try {
					pst.close();
				} catch (SQLException e) {e.printStackTrace();}
			 }
			
			 if(con != null)
			 {
				try {
					con.close();
				} catch (SQLException e) {e.printStackTrace();}
			 }
		}
		return f;
 }
	public ArrayList<BookNow> viewYourBookings(String email)
	{
		ArrayList<BookNow> booklist = new ArrayList<BookNow>();
		PreparedStatement pst = null;
		Connection con = null;
		ResultSet rs = null;
		
		try{
			con = DBConnection.getMySQlConnection();
			pst= con.prepareStatement("select * from booking where email=?");
			pst.setString(1, email);
			rs = pst.executeQuery();
			
			while(rs.next())
			{
				//CREATE NEW OBJECT
				BookNow obj = new BookNow();
				
				//STORE VALUES WITHIN THE OBJECT
				
				obj.setBookingid(rs.getString(1));
				obj.setTourid(rs.getString(2));
				obj.setEmail(rs.getString(3));
				obj.setName(rs.getString(4));
				obj.setAge(rs.getString(5));
				obj.setGender(rs.getString(6));
				obj.setRoom(rs.getString(7));
				obj.setFood(rs.getString(8));
				obj.setPayment(rs.getString(9));
				
				//ADD OBJECT IN THE ARRAYLIST
				booklist.add(obj);
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		 finally 
		 {
			 
			 if(pst != null)
			 {
				try {
					pst.close();
				} catch (SQLException e) {e.printStackTrace();}
			 }
			 
			 if(rs != null)
			 {
				 try {
					rs.close();
				} catch (SQLException e) {e.printStackTrace();}
			 }
				 
			 if(con != null)
			 {
				try {
					con.close();
				} catch (SQLException e) {e.printStackTrace();}
			 }
		 }
		return booklist;
	}
	
	
	
	
	public ArrayList<BookNow> viewTourDetails(String tourid)
	{
		ArrayList<BookNow> booklist = new ArrayList<BookNow>();
		PreparedStatement pst = null;
		Connection con = null;
		ResultSet rs = null;
		try{
			con = DBConnection.getMySQlConnection();
			pst= con.prepareStatement("select * from booking where tourid=?");
			pst.setString(1, tourid);
			rs = pst.executeQuery();
			
			while(rs.next())
			{
				//CREATE NEW OBJECT
				BookNow obj = new BookNow();
				
				//STORE VALUES WITHIN THE OBJECT
				
				obj.setBookingid(rs.getString(1));
				obj.setTourid(rs.getString(2));
				obj.setEmail(rs.getString(3));
				obj.setName(rs.getString(4));
				obj.setAge(rs.getString(5));
				obj.setGender(rs.getString(6));
				obj.setRoom(rs.getString(7));
				obj.setFood(rs.getString(8));
				obj.setPayment(rs.getString(9));
				
				//ADD OBJECT IN THE ARRAYLIST
				booklist.add(obj);
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		 finally 
		 {
			 
			 if(pst != null)
			 {
				try {
					pst.close();
				} catch (SQLException e) {e.printStackTrace();}
			 }
			 
			 if(rs != null)
			 {
				 try {
					rs.close();
				} catch (SQLException e) {e.printStackTrace();}
			 }
				 
			 if(con != null)
			 {
				try {
					con.close();
				} catch (SQLException e) {e.printStackTrace();}
			 }
		 }
		
		return booklist;
	}
	public boolean updatePassenger(String tid) {
			boolean f2 = false;
		    PreparedStatement pst = null;
		    PreparedStatement pst1 = null;
			Connection con = null;
			ResultSet rs = null;
			
			try{
				con = DBConnection.getMySQlConnection();
				pst = con.prepareStatement("select passenger from tour where id = ?");

				pst.setString(1,tid);
				rs = pst.executeQuery();
				rs.next();
                int x = Integer.parseInt(rs.getString(1));
                x = x -2;
                pst1 = con.prepareStatement("update tour set passenger=? where id=?");
                pst1.setString(1, ""+x);
                pst1.setString(2, tid);
                int i = pst1.executeUpdate();
				if(i > 0 )
					f2 = true;
			}catch(SQLException e){e.printStackTrace();
			}
			 finally 
			 {
				 
				 if(pst != null)
				 {
					try {
						pst.close();
					} catch (SQLException e) {e.printStackTrace();}
				 }
				 
				 if(rs != null)
				 {
					 try {
						rs.close();
					} catch (SQLException e) {e.printStackTrace();}
				 }
					 
				 if(con != null)
				 {
					try {
						con.close();
					} catch (SQLException e) {e.printStackTrace();}
				 }
			 }
			return f2;
	}
	
}
