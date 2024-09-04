package com.Client;

import java.util.ArrayList;

import com.Controller.ShowRoomController;
import com.Entity.ShowRoom;

public class Client {
	
	public static void main(String[] args) {
		ArrayList<ShowRoom>al=ShowRoomController.fetchallcars();
		
		System.out.println("1 fetchallcars");
		for (ShowRoom showRoom : al) {
			System.out.println(showRoom);
		}System.out.println();
		
		System.out.println("2 fetchallcarspername");
		ShowRoomController.fetchallcarspername();
		System.out.println();
		
		System.out.println("3 fetchallcarspercarmanufactureyear");
		ShowRoomController.fetchallcarspercarmanufactureyear();
		System.out.println();
		
		System.out.println("4 fetchallcarspercarprice");
		ShowRoomController.fetchallcarspercarprice();
		System.out.println();
		
		System.out.println("5 fetchallcarspercartype");
		ShowRoomController.fetchallcarspercartype();
		System.out.println();
		
		System.out.println("6 fetchallcarspertyresize");
		ShowRoomController.fetchallcarspertyresize();
		System.out.println();
		
		System.out.println("7 fetchallcarspersunroof");
		ShowRoomController.fetchallcarspersunroof();
		System.out.println();
		
		System.out.println("8 fetchallcarsperhandbreake");
		ShowRoomController.fetchallcarsperhandbreake();
		System.out.println();
		
		System.out.println("9 fetchallcarsperac");
		ShowRoomController.fetchallcarsperac();
		System.out.println();
		
		System.out.println("10 fetchallcarspermusic");
		ShowRoomController.fetchallcarspermusic();
		System.out.println();
		
		System.out.println("12 fetchallcarspercardownpayment");
		ShowRoomController.fetchallcarspercardownpayment();
		System.out.println();
		
		System.out.println("13 fetchallcarspercardiscount");
		ShowRoomController.fetchallcarspercardiscount();
		System.out.println();
		
		System.out.println("14 fetchallcarspercarintrest");
		ShowRoomController.fetchallcarspercarintrest();
		System.out.println();
		
		System.out.println("15 fetchallcarspercarwarrenty");
		ShowRoomController.fetchallcarspercarwarrenty();
		System.out.println();
		
		
		
	}
}
