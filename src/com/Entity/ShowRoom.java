package com.Entity;

public class ShowRoom {
	
	String carname;
    int carprice;
    int carmanufactureyear;
    String cartype;
    int  tyresize;
    String sunroof;
    String handbreake;
    String ac;
    String music;
    String camera;
    int cardownpayment;
    int cardiscount;
    int carintrest;
    String carwarrenty;
	public ShowRoom(String carname, int carprice, int carmanufactureyear, String cartype, int tyresize, String sunroof,
			String handbreake, String ac, String music, String camera, int cardownpayment, int cardiscount,
			int carintrest, String carwarrenty) {
		super();
		this.carname = carname;
		this.carprice = carprice;
		this.carmanufactureyear = carmanufactureyear;
		this.cartype = cartype;
		this.tyresize = tyresize;
		this.sunroof = sunroof;
		this.handbreake = handbreake;
		this.ac = ac;
		this.music = music;
		this.camera = camera;
		this.cardownpayment = cardownpayment;
		this.cardiscount = cardiscount;
		this.carintrest = carintrest;
		this.carwarrenty = carwarrenty;
	}
	public ShowRoom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public int getCarprice() {
		return carprice;
	}
	public void setCarprice(int carprice) {
		this.carprice = carprice;
	}
	public int getCarmanufactureyear() {
		return carmanufactureyear;
	}
	public void setCarmanufactureyear(int carmanufactureyear) {
		this.carmanufactureyear = carmanufactureyear;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	public int getTyresize() {
		return tyresize;
	}
	public void setTyresize(int tyresize) {
		this.tyresize = tyresize;
	}
	public String getSunroof() {
		return sunroof;
	}
	public void setSunroof(String sunroof) {
		this.sunroof = sunroof;
	}
	public String getHandbreake() {
		return handbreake;
	}
	public void setHandbreake(String handbreake) {
		this.handbreake = handbreake;
	}
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getMusic() {
		return music;
	}
	public void setMusic(String music) {
		this.music = music;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	public int getCardownpayment() {
		return cardownpayment;
	}
	public void setCardownpayment(int cardownpayment) {
		this.cardownpayment = cardownpayment;
	}
	public int getCardiscount() {
		return cardiscount;
	}
	public void setCardiscount(int cardiscount) {
		this.cardiscount = cardiscount;
	}
	public int getCarintrest() {
		return carintrest;
	}
	public void setCarintrest(int carintrest) {
		this.carintrest = carintrest;
	}
	public String getCarwarrenty() {
		return carwarrenty;
	}
	public void setCarwarrenty(String carwarrenty) {
		this.carwarrenty = carwarrenty;
	}
	@Override
	public String toString() {
		return "ShowRoom [carname=" + carname + ", carprice=" + carprice + ", carmanufactureyear=" + carmanufactureyear
				+ ", cartype=" + cartype + ", tyresize=" + tyresize + ", sunroof=" + sunroof + ", handbreake="
				+ handbreake + ", ac=" + ac + ", music=" + music + ", camera=" + camera + ", cardownpayment="
				+ cardownpayment + ", cardiscount=" + cardiscount + ", carintrest=" + carintrest + ", carwarrenty="
				+ carwarrenty + "]";
	}
    
    
}
