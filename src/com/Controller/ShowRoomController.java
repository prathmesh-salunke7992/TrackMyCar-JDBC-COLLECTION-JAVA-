package com.Controller;

import java.util.ArrayList;

import com.Entity.ShowRoom;
import com.Service.ShowRoomService;

public class ShowRoomController {

	public static ArrayList<ShowRoom> fetchallcars(){
		ShowRoomService ShowRoomService =new ShowRoomService();
		return ShowRoomService.fetchallcars();
	}
	
	
		
	public static ShowRoom fetchallcarspername(){
		ShowRoomService showRoomService=new ShowRoomService();
		return showRoomService.fetchallcarspername("pun");
		
	}
	public static ShowRoom fetchallcarspercarmanufactureyear(){
		ShowRoomService showRoomService=new ShowRoomService();
		return showRoomService.fetchallcarspercarmanufactureyear(2000);
	}
	public static ShowRoom fetchallcarspercarprice(){
		ShowRoomService showRoomService=new ShowRoomService();
		return showRoomService.fetchallcarspercarprice(1500);
	}
	
	public static ShowRoom fetchallcarspercartype(){
		ShowRoomService showRoomService=new ShowRoomService();
		return showRoomService.fetchallcarspercartype("coup");
	}
	
	public static ShowRoom fetchallcarspertyresize(){
		ShowRoomService showRoomService=new ShowRoomService();
		return showRoomService.fetchallcarspertyresize(22);
	}
	
	public static ShowRoom fetchallcarspersunroof() {
		ShowRoomService showRoomService=new ShowRoomService();
		return showRoomService.fetchallcarspersunroof("no");
	}
	
	public static ShowRoom fetchallcarsperhandbreake() {
		ShowRoomService showRoomService=new ShowRoomService();
		return showRoomService.fetchallcarsperhandbreake("no");
	}
	
	public static ShowRoom fetchallcarsperac() {
		ShowRoomService showRoomService=new ShowRoomService();
		return showRoomService.fetchallcarsperac("yes");
	}
	
	public static ShowRoom fetchallcarspermusic() {
		ShowRoomService showRoomService=new ShowRoomService();
		return showRoomService.fetchallcarspermusic("no");
	}
	
	public static ShowRoom fetchallcarspercamera() {
		ShowRoomService showRoomService=new ShowRoomService();
		return showRoomService.fetchallcarspercamera("hk");
	}
	
	public static ShowRoom fetchallcarspercardownpayment() {
		ShowRoomService showRoomService=new ShowRoomService();
		return showRoomService.fetchallcarspercardownpayment(70);
	}
	
	public static ShowRoom fetchallcarspercardiscount() {
		ShowRoomService showRoomService=new ShowRoomService();
		return showRoomService.fetchallcarspercardiscount(50);
	}
	
	public static ShowRoom fetchallcarspercarintrest() {
		ShowRoomService showRoomService=new ShowRoomService();
		return showRoomService.fetchallcarspercarintrest(9);
	}
	
	public static ShowRoom fetchallcarspercarwarrenty() {
		ShowRoomService showRoomService=new ShowRoomService();
		return showRoomService.fetchallcarspercarintrest(9);
	}
	}
