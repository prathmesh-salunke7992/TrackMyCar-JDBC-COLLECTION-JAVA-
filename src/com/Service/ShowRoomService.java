package com.Service;

import java.util.ArrayList;
import com.Dao.ShowRoomDao;
import com.Entity.ShowRoom;


public class ShowRoomService {

	
	public ArrayList<ShowRoom> fetchallcars() {
		ShowRoomDao ShowRoomDao =new ShowRoomDao();
		ArrayList<ShowRoom> al=ShowRoomDao.fetchallcars();
	
		return  al;
		
	}
	
	
	
	public   ShowRoom fetchallcarspercarprice(int carprice){
		ShowRoomDao ShowRoomDao =new ShowRoomDao();
		 ArrayList<ShowRoom> al=ShowRoomDao.fetchallcars();
		ShowRoom ShowRoom1 =new ShowRoom();
		for (ShowRoom showRoom : al) {
		if(carprice==showRoom.getCarprice()) {
			System.out.println(showRoom);
		}
		}
		if(carprice!=ShowRoom1.getCarprice()) {
			System.out.println("carprice is not present");
		}
		
		return ShowRoom1;
	}
	
	public  ShowRoom fetchallcarspername( String carname) {
		 ShowRoomDao ShowRoomDao =new ShowRoomDao();
		 ArrayList<ShowRoom> al=ShowRoomDao.fetchallcars();
		 ShowRoom ShowRoom1=new ShowRoom();
		 for (ShowRoom showRoom : al) {
			if(carname.equals(showRoom.getCarname())) {
				System.out.println(showRoom);				
			}			
		}
		 if(!carname.equals(ShowRoom1.getCarname())) {
				System.out.println("carname is not present");				
			}		
				
				
		return ShowRoom1 ;
	}
	public  ShowRoom fetchallcarspercarmanufactureyear(int carmanufactureyear) {
		 ShowRoomDao ShowRoomDao =new ShowRoomDao();
		 ArrayList<ShowRoom> al=ShowRoomDao.fetchallcars();
		 ShowRoom ShowRoom1=new ShowRoom();
          for (ShowRoom showRoom : al) {
			if(carmanufactureyear==showRoom.getCarmanufactureyear()) {
				System.out.println(showRoom);
			}			
		}
          if(carmanufactureyear!=ShowRoom1.getCarmanufactureyear()) {
				System.out.println("carmanufactureyear not found");
			}
          return ShowRoom1 ;
	}
	
	public ShowRoom fetchallcarspercartype(String cartype) {
		ShowRoomDao ShowRoomDao =new ShowRoomDao();
		 ArrayList<ShowRoom> al=ShowRoomDao.fetchallcars();
		 ShowRoom ShowRoom1=new ShowRoom();
		 for (ShowRoom showRoom : al) {
			 if(cartype.equals(showRoom.getCartype())) {
					System.out.println(showRoom);
			 }	 
		}
		 if(!cartype.equals(ShowRoom1.getCartype())) {
				System.out.println("cartype is not present");
		 }	 
		return ShowRoom1;
	}
	
	public ShowRoom fetchallcarspertyresize(int  tyresize) {
		ShowRoomDao ShowRoomDao =new ShowRoomDao();
		 ArrayList<ShowRoom> al=ShowRoomDao.fetchallcars();
		 ShowRoom ShowRoom1=new ShowRoom();
		  
		 for (ShowRoom showRoom : al) {
			 if(tyresize==showRoom.getTyresize()) {
					System.out.println(showRoom);	
			 }				
	 }
		 if(tyresize!=ShowRoom1.getTyresize()) {
				System.out.println("tyresize is not present");	
		 }	
		return ShowRoom1;
}
	
	public ShowRoom fetchallcarspersunroof(String sunroof) {
		ShowRoomDao ShowRoomDao =new ShowRoomDao();
		 ArrayList<ShowRoom> al=ShowRoomDao.fetchallcars();
		 ShowRoom ShowRoom1=new ShowRoom();
		  
		 for (ShowRoom showRoom : al) {
			 if(sunroof.equalsIgnoreCase(showRoom.getSunroof())) {
					System.out.println(showRoom);	
			 }	
			 if(sunroof.equals(ShowRoom1.getSunroof())) {
					System.out.println(showRoom);	
			 }	
			
	 }
		 if(!sunroof.equals(ShowRoom1.getSunroof())) {
				System.out.println("sunroof");	
		 }	
		return ShowRoom1;
		
	}
	
	public ShowRoom fetchallcarsperhandbreake(String handbreake) {
		ShowRoomDao ShowRoomDao =new ShowRoomDao();
		 ArrayList<ShowRoom> al=ShowRoomDao.fetchallcars();
		 ShowRoom ShowRoom1=new ShowRoom();
		  
		 for (ShowRoom showRoom : al) {
			 if(handbreake.equals(showRoom.getHandbreake())) {
					System.out.println(showRoom);	
			 }	
			 if(handbreake.equalsIgnoreCase(showRoom.getHandbreake())) {
					System.out.println(showRoom);	
			 }	
			
	 }
		 if(!handbreake.equals(ShowRoom1.getHandbreake())) {
				System.out.println("handbreake is not present");	
		 }	
		return ShowRoom1;
		
	}
	
	public ShowRoom fetchallcarsperac(String ac) {
		ShowRoomDao ShowRoomDao =new ShowRoomDao();
		 ArrayList<ShowRoom> al=ShowRoomDao.fetchallcars();
		 ShowRoom ShowRoom1=new ShowRoom();
		  
		 for (ShowRoom showRoom : al) {
			 if(ac.equals(showRoom.getAc())) {
					System.out.println(showRoom);	
			 }	
			 if(ac.equalsIgnoreCase(showRoom.getAc())) {
					System.out.println(showRoom);	
			 }
			 
			
	 }
		return ShowRoom1;
		
	}
	
	public ShowRoom fetchallcarspermusic(String  music) {
		ShowRoomDao ShowRoomDao =new ShowRoomDao();
		 ArrayList<ShowRoom> al=ShowRoomDao.fetchallcars();
		 ShowRoom ShowRoom1=new ShowRoom();
		  
		 for (ShowRoom showRoom : al) {
			 if(music.equals(showRoom.getMusic())) {
					System.out.println(showRoom);	
			 }	
			
	 }
		 if(!music.equals(ShowRoom1.getMusic())) {
				System.out.println("music is not present");	
		 }	
		return ShowRoom1;
		
	}
	
	public ShowRoom fetchallcarspercamera(String camera) {
		ShowRoomDao ShowRoomDao =new ShowRoomDao();
		 ArrayList<ShowRoom> al=ShowRoomDao.fetchallcars();
		 ShowRoom ShowRoom1=new ShowRoom();
		  
		 for (ShowRoom showRoom : al) {
			 if(camera.equals(showRoom.getCamera())) {
					System.out.println(showRoom);	
			 }	
			
	 }
		 if(!camera.equals(ShowRoom1.getCamera())) {
				System.out.println("camera is not present");	
		 }	
		return ShowRoom1;
		
	}
	
	public ShowRoom fetchallcarspercardownpayment(int cardownpayment) {
		ShowRoomDao ShowRoomDao =new ShowRoomDao();
		 ArrayList<ShowRoom> al=ShowRoomDao.fetchallcars();
		 ShowRoom ShowRoom1=new ShowRoom();
		  
		 for (ShowRoom showRoom : al) {
			 if(cardownpayment==showRoom.getCardownpayment()) {
					System.out.println(showRoom);	
			 }				
	 }
		 if(cardownpayment!=ShowRoom1.getCardownpayment()) {
				System.out.println("cardownpayment is not present");	
		 } 	
		
		return ShowRoom1;
		
	}
	
	public ShowRoom fetchallcarspercardiscount(int cardiscount) {
		ShowRoomDao ShowRoomDao =new ShowRoomDao();
		 ArrayList<ShowRoom> al=ShowRoomDao.fetchallcars();
		 ShowRoom ShowRoom1=new ShowRoom();
		  
		 for (ShowRoom showRoom : al) {
			 if(cardiscount==showRoom.getCardiscount()) {
					System.out.println(showRoom);	
			 }				
	 }
		 if(cardiscount!=ShowRoom1.getCardiscount()) {
				System.out.println("cardiscount is not present");	
		 }	
		
		return ShowRoom1;
		
	}
	
	public ShowRoom fetchallcarspercarintrest(int carintrest) {
		ShowRoomDao ShowRoomDao =new ShowRoomDao();
		 ArrayList<ShowRoom> al=ShowRoomDao.fetchallcars();
		 ShowRoom ShowRoom1=new ShowRoom();
		  
		 for (ShowRoom showRoom : al) {
			 if(carintrest==showRoom.getCarintrest()) {
					System.out.println(showRoom);	
			 }	
			
	 }
		 if(carintrest!=ShowRoom1.getCarintrest()) {
				System.out.println("carintrest is not present");	
		 }	
		
		return ShowRoom1;
		
	}
	
	public ShowRoom fetchallcarspercarwarrenty(String carwarrenty) {
		ShowRoomDao ShowRoomDao =new ShowRoomDao();
		 ArrayList<ShowRoom> al=ShowRoomDao.fetchallcars();
		 ShowRoom ShowRoom1=new ShowRoom();
		  
		 for (ShowRoom showRoom : al) {
			if(carwarrenty.equals(showRoom.getCarwarrenty())) {
				System.out.println(showRoom);
			}			
	 }
		 if(!carwarrenty.equals(ShowRoom1.getCarwarrenty())) {
			System.out.println("carwarrenty is not present");
		}
		return ShowRoom1;
		
	}
}
