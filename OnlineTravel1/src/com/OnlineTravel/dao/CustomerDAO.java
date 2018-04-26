package com.OnlineTravel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.OnlineTravel.logic.CustomerInfo;
import com.OnlineTravel.logic.FeedbackInfo;
import com.OnlineTravel.logic.TourInfo;

public class CustomerDAO {
	//Method for inserting new records in the customer table 
		public boolean insertRecord(CustomerInfo cobj)
		{
			boolean f = false;
			PreparedStatement pst = null;
			Connection con = null;
			
			try
			{
				con = DBConnection.getMySQlConnection();
				pst = con.prepareStatement("insert into customer values(?,?,?,?,?,?)");
				
				pst.setString(1, cobj.getName());
				pst.setString(2, cobj.getEmail());
				pst.setString(3, cobj.getPassword());
				pst.setString(4, cobj.getNumber());
				pst.setString(5, cobj.getAddress());
				pst.setString(6, cobj.getPlace());
				
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
		//Method for checking the details of the customer
		public CustomerInfo loginCheck(String email, String pass)
		{
			CustomerInfo custobj=null;
			boolean f = false;
			PreparedStatement pst = null;
			Connection con = null;
			
			try
			{
				con = DBConnection.getMySQlConnection();
				pst = con.prepareStatement("select * from customer where email=? and password=?");
				
				pst.setString(1, email);
				pst.setString(2, pass);
				
				ResultSet rs = pst.executeQuery();
				if(rs.next())
				{
					custobj = new CustomerInfo();
					custobj.setName(rs.getString(1));
					
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
			
			return custobj;
		}
		
		//Method for checking the details of the admin
		public boolean adminLoginCheck(String email, String pass)
		{
			boolean f = false;
			PreparedStatement pst = null;
			Connection con = null;
			ResultSet rs = null;
			
			try
			{
				con = DBConnection.getMySQlConnection();
				pst = con.prepareStatement("select * from admin where email=? and password=?");
				
				pst.setString(1, email);
				pst.setString(2, pass);
				
				rs = pst.executeQuery();
				if(rs.next())
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
			
			return f;
		}
		public boolean editProfile(CustomerInfo cobj) {
				boolean f = false;
				PreparedStatement pst = null;
				Connection con = null;
				try{
					con = DBConnection.getMySQlConnection();
					pst = con.prepareStatement("update customer set name=?, password=?, number=?, address=?, place=? where email=?");
					
					pst.setString(1, cobj.getName());
					pst.setString(2, cobj.getPassword());
					pst.setString(3, cobj.getNumber());
					pst.setString(4, cobj.getAddress());
					pst.setString(5, cobj.getPlace());
					pst.setString(6, cobj.getEmail());
					
					int i = pst.executeUpdate();
				     
					 if(i > 0 )
						  f = true;
					
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
						 
					 if(con != null)
					 {
						try {
							con.close();
						} catch (SQLException e) {e.printStackTrace();}
					 }
				 }
				return f;
			}
		
		
		public ArrayList<CustomerInfo> searchCustomerByEmail(String email){

		    ArrayList<CustomerInfo> custlist = new ArrayList<CustomerInfo>();
			PreparedStatement pst = null;
			Connection con = null;
			ResultSet rs = null;
			try{
				con = DBConnection.getMySQlConnection();
				pst = con.prepareStatement("select * from customer where email=?");
				
				pst.setString(1, email);
				rs = pst.executeQuery();
				
				while(rs.next()){
					 //CREATE NEW OBJECT
					   CustomerInfo obj = new CustomerInfo();
					   
					   //EXTRACT VALUE FROM ResultsetS & STORE in the OBJECT
					   obj.setName(rs.getString(1));
					   obj.setEmail(rs.getString(2));
					   obj.setPassword(rs.getString(3));
					   obj.setNumber(rs.getString(4));
					   obj.setAddress(rs.getString(5));
					   obj.setPlace(rs.getString(6));
					   
					   //ADD OBJECT IN THE ARRAYLIST
					   custlist.add(obj);
				  }		
			}catch(SQLException e){e.printStackTrace();}
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
			
			return custlist;
		}
		
		public boolean insertFeedback(FeedbackInfo fobj) {
			{
				boolean f = false;
				PreparedStatement pst = null;
				Connection con = null;
				
				try
				{
					con = DBConnection.getMySQlConnection();
					pst = con.prepareStatement("insert into feedbacks values(?,?,?,?,?,?,?)");
					
					pst.setString(1, fobj.getFirstname());
					pst.setString(2, fobj.getLastname());
					pst.setString(3, fobj.getCode());
					pst.setString(4, fobj.getNumber());
					pst.setString(5, fobj.getEmail());
					pst.setString(6, fobj.getRating());
					pst.setString(7, fobj.getFeedback());
					
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
		}
		public ArrayList<FeedbackInfo> displayAllFeedback() 
			{
				ArrayList<FeedbackInfo> feedlist = new ArrayList<FeedbackInfo>();
				PreparedStatement pst = null;
				Connection con = null;
				ResultSet rs = null;
				try{
					con = DBConnection.getMySQlConnection();
					pst= con.prepareStatement("select * from feedbacks");
					rs = pst.executeQuery();
					
					while(rs.next())
					{
						//CREATE NEW OBJECT
						FeedbackInfo obj = new FeedbackInfo();
						
						//STORE VALUES WITHIN THE OBJECT
						
						obj.setFirstname(rs.getString(1));
						obj.setLastname(rs.getString(2));
						obj.setCode(rs.getString(3));
						obj.setNumber(rs.getString(4));
						obj.setEmail(rs.getString(5));
						obj.setRating(rs.getString(6));
						obj.setFeedback(rs.getString(7));
						
						//ADD OBJECT IN THE ARRAYLIST
						feedlist.add(obj);
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
				
				return feedlist;
		}

}