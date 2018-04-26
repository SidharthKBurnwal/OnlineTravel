package com.OnlineTravel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.OnlineTravel.logic.CustomerInfo;
import com.OnlineTravel.logic.TourInfo;

public class TourDAO {
	public boolean insertTour(TourInfo tobj)
	{
		boolean f = false;
		PreparedStatement pst = null;
		Connection con = null;
		try
		{
			con = DBConnection.getMySQlConnection();
			pst = con.prepareStatement("insert into tour values(?,?,?,?,?,?,?)");
			
			pst.setString(1, tobj.getId());
			pst.setString(2, tobj.getType());
			pst.setString(3, tobj.getPlace());
			pst.setString(4, tobj.getStartDate());
			pst.setString(5, tobj.getEndDate());
			pst.setString(6, tobj.getCost());
			pst.setString(7, tobj.getPassenger());
			
			int i =pst.executeUpdate();
			if(i > 0)
				f = true;
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
	
	public boolean deleteTour(String id)
	{
		boolean f = false;
		PreparedStatement pst = null;
		Connection con = null;
		try
		{
			con = DBConnection.getMySQlConnection();
			pst = con.prepareStatement("delete from tour where id=?");
			
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
	
	
	public ArrayList<TourInfo> displayAllTour()
	{
		ArrayList<TourInfo> tourlist = new ArrayList<TourInfo>();
		PreparedStatement pst = null;
		Connection con = null;
		ResultSet rs = null;
		try{
			con = DBConnection.getMySQlConnection();
			pst= con.prepareStatement("select * from tour");
			rs = pst.executeQuery();
			
			while(rs.next())
			{
				//CREATE NEW OBJECT
				TourInfo obj = new TourInfo();
				
				//STORE VALUES WITHIN THE OBJECT
				
				obj.setId(rs.getString(1));
				obj.setType(rs.getString(2));
				obj.setPlace(rs.getString(3));
				obj.setStartDate(rs.getString(4));
				obj.setEndDate(rs.getString(5));
				obj.setCost(rs.getString(6));
				obj.setPassenger(rs.getString(7));
				
				//ADD OBJECT IN THE ARRAYLIST
				tourlist.add(obj);
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
		return tourlist;
	}
	
	
	
	public ArrayList<TourInfo> searchTourByPlace(String place){

	    ArrayList<TourInfo> tourlist = new ArrayList<TourInfo>();
		PreparedStatement pst = null;
		Connection con = null;
		ResultSet rs = null;
		try{
			con = DBConnection.getMySQlConnection();
			pst = con.prepareStatement("select * from tour where place=?");
			
			pst.setString(1, place);
			rs = pst.executeQuery();
			
			while(rs.next()){
				 //CREATE NEW OBJECT
				   TourInfo obj = new TourInfo();
				   
				   //EXTRACT VALUE FROM ResultsetS & STORE in the OBJECT
				   obj.setId(rs.getString(1));
				   obj.setType(rs.getString(2));
				   obj.setPlace(rs.getString(3));
				   obj.setStartDate(rs.getString(4));
				   obj.setEndDate(rs.getString(5));
				   obj.setCost(rs.getString(6));
				   obj.setPassenger(rs.getString(7));
				   
				   //ADD OBJECT IN THE ARRAYLIST
				   tourlist.add(obj);
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
		
		return tourlist;
	}
	
	
	
	public ArrayList<TourInfo> searchTourByType(String type){

	    ArrayList<TourInfo> tourlist = new ArrayList<TourInfo>();
		PreparedStatement pst = null;
		Connection con = null;
		ResultSet rs = null;
		try{
			con = DBConnection.getMySQlConnection();
			pst = con.prepareStatement("select * from tour where type=?");
			
			pst.setString(1, type);
			rs = pst.executeQuery();
			
			while(rs.next()){
				 //CREATE NEW OBJECT
				   TourInfo obj = new TourInfo();
				   
				   //EXTRACT VALUE FROM ResultsetS & STORE in the OBJECT
				   obj.setId(rs.getString(1));
				   obj.setType(rs.getString(2));
				   obj.setPlace(rs.getString(3));
				   obj.setStartDate(rs.getString(4));
				   obj.setEndDate(rs.getString(5));
				   obj.setCost(rs.getString(6));
				   obj.setPassenger(rs.getString(7));
				   
				   //ADD OBJECT IN THE ARRAYLIST
				   tourlist.add(obj);
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
		
		return tourlist;
	}
	
	public int selectPassenger(String tid)
	{
		PreparedStatement pst = null;
		Connection con = null;
		ResultSet rs = null;
		int x=0;
		try{
			con = DBConnection.getMySQlConnection();
			pst = con.prepareStatement("select passenger from tour where tid=?");
			
			pst.setString(1, tid);
			rs = pst.executeQuery();
			
			while(rs.next())
			{
				x = Integer.parseInt(rs.getString(7));
				x--;
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
	return x;
	}

	public boolean editTourDetails(TourInfo tobj) {
		boolean f = false;
		PreparedStatement pst = null;
		Connection con = null;
		try{
			con = DBConnection.getMySQlConnection();
			pst = con.prepareStatement("update tour set type=?, place=?, startDate=?, endDate=?, cost=?, passenger=? where id=?");
			
			pst.setString(1, tobj.getType());
			pst.setString(2, tobj.getPlace());
			pst.setString(3, tobj.getStartDate());
			pst.setString(4, tobj.getEndDate());
			pst.setString(5, tobj.getCost());
			pst.setString(6, tobj.getPassenger());
			pst.setString(7, tobj.getId());
			
			int i = pst.executeUpdate();
		     
			 if(i > 0 )
				  f = true;
			
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

	public ArrayList<TourInfo> searchTourById(String tid){

	    ArrayList<TourInfo> tourlist = new ArrayList<TourInfo>();
		PreparedStatement pst = null;
		Connection con = null;
		ResultSet rs = null;
		try{
			con = DBConnection.getMySQlConnection();
			pst = con.prepareStatement("select * from tour where id=?");
			
			pst.setString(1, tid);
			rs = pst.executeQuery();
			
			while(rs.next()){
				 //CREATE NEW OBJECT
				   TourInfo obj = new TourInfo();
				   
				   //EXTRACT VALUE FROM ResultsetS & STORE in the OBJECT
				   obj.setId(rs.getString(1));
				   obj.setType(rs.getString(2));
				   obj.setPlace(rs.getString(3));
				   obj.setStartDate(rs.getString(4));
				   obj.setEndDate(rs.getString(5));
				   obj.setCost(rs.getString(6));
				   obj.setPassenger(rs.getString(7));
				   
				   //ADD OBJECT IN THE ARRAYLIST
				   tourlist.add(obj);
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
		return tourlist;
	}
		
}

