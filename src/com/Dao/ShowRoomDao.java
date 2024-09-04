package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.Entity.ShowRoom;

public class ShowRoomDao {

	
	public ArrayList<ShowRoom> fetchallcars(){
		ArrayList<ShowRoom> al=new ArrayList<>();
		ShowRoom ShowRoom =new ShowRoom();
		try {
			String url="jdbc:mysql://localhost:3306/showroom";
			String username="root";
			String password="root";
			
			Connection Connection=DriverManager.getConnection(url, username, password);

			Statement Statement= Connection.createStatement();
			String query="select * from tata";
			
			ResultSet rss=Statement.executeQuery(query);
			while (rss.next()) {
				ShowRoom ShowRoom1=new ShowRoom();
				String name=rss.getNString(1);
				int price=rss.getInt(2);
				int year=rss.getInt(3);
				String type=rss.getString(4);
				int tyre=rss.getInt(5);
				String sunroof=rss.getString(6);
				String handbreake=rss.getString(7);
				String ac=rss.getString(8);
				String music=rss.getString(9);
				String camera=rss.getString(10);
				int downpayment=rss.getInt(11);
				int discount=rss.getInt(12);
                int intrest=rss.getInt(13);
                String warrenty=rss.getString(14);
                
				ShowRoom1.setCarname(name);
				ShowRoom1.setCarprice(price);
				ShowRoom1.setCarmanufactureyear(year);
				ShowRoom1.setCartype(type);
				ShowRoom1.setTyresize(tyre);
				ShowRoom1.setSunroof(sunroof);
				ShowRoom1.setHandbreake(handbreake);
				ShowRoom1.setAc(ac);
				ShowRoom1.setMusic(music);
				ShowRoom1.setCamera(camera);
				ShowRoom1.setCardownpayment(downpayment);
				ShowRoom1.setCardiscount(discount);
				ShowRoom1.setCarintrest(intrest);
				ShowRoom1.setCarwarrenty(warrenty);
				al.add(ShowRoom1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return al;	
	}
	
	
	public static ShowRoom fetchallcarspername(String carname) {
		ArrayList<ShowRoom> al=new ArrayList<>();
		ShowRoom ShowRoom =new ShowRoom();
		return ShowRoom;
	}
	
	public static ShowRoom fetchallcarspercarprice(int carprice) {
		ArrayList<ShowRoom> al=new ArrayList<>();
		ShowRoom ShowRoom =new ShowRoom();
		return ShowRoom;
	}
	
	public static ShowRoom fetchallcarspercarmanufactureyear(int carmanufactureyear) {
		ArrayList<ShowRoom> al=new ArrayList<>();
		ShowRoom ShowRoom =new ShowRoom();
		return ShowRoom;
	}
	
	public static ShowRoom fetchallcarspercartype(String cartype) {
		ArrayList<ShowRoom> al=new ArrayList<>();
		ShowRoom ShowRoom =new ShowRoom();
		return ShowRoom;
	}
	
	public static ShowRoom fetchallcarspertyresize(int  tyresize) {
		ArrayList<ShowRoom> al=new ArrayList<>();
		ShowRoom ShowRoom =new ShowRoom();
		return ShowRoom;
	}
	
	public static ShowRoom fetchallcarspersunroof(String sunroof) {
		ArrayList<ShowRoom> al=new ArrayList<>();
		ShowRoom ShowRoom =new ShowRoom();
		return ShowRoom;
	}
	
	public static ShowRoom fetchallcarsperhandbreake(String handbreake) {
		ArrayList<ShowRoom> al=new ArrayList<>();
		ShowRoom ShowRoom =new ShowRoom();
		return ShowRoom;
	}
	
	public static ShowRoom fetchallcarsperac(String ac) {
		ArrayList<ShowRoom> al=new ArrayList<>();
		ShowRoom ShowRoom =new ShowRoom();
		return ShowRoom;
	}
	
	public static ShowRoom fetchallcarspermusic(String music) {
		ArrayList<ShowRoom> al=new ArrayList<>();
		ShowRoom ShowRoom =new ShowRoom();
		return ShowRoom;
	}
	
	public static ShowRoom fetchallcarspercamera(String camera) {
		ArrayList<ShowRoom> al=new ArrayList<>();
		ShowRoom ShowRoom =new ShowRoom();
		return ShowRoom;
	}
	
	public static ShowRoom fetchallcarspercardownpayment(int cardownpayment) {
		ArrayList<ShowRoom> al=new ArrayList<>();
		ShowRoom ShowRoom =new ShowRoom();
		return ShowRoom;
	}
	
	public static ShowRoom fetchallcarspercardiscount(int cardiscount) {
		ArrayList<ShowRoom> al=new ArrayList<>();
		ShowRoom ShowRoom =new ShowRoom();
		return ShowRoom;
	}
	
	public static ShowRoom fetchallcarspercarintrest(int carintrest) {
		ArrayList<ShowRoom> al=new ArrayList<>();
		ShowRoom ShowRoom =new ShowRoom();
		return ShowRoom;
	}
	
	public static ShowRoom fetchallcarspercarwarrenty(String carwarrenty) {
		ArrayList<ShowRoom> al=new ArrayList<>();
		ShowRoom ShowRoom =new ShowRoom();
		return ShowRoom;
	}
	
	
}
