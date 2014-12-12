package com.michael.suitmedia;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Event {
	
	private  String Image="";
    private  String Name=""; 
    private  String Tanggal="";
    
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTanggal() {
		return Tanggal;
	}
	public void setTanggal(String tanggal) {
		Tanggal = tanggal;
	}

}
