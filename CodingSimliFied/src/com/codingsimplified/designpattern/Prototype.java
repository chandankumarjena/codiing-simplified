package com.codingsimplified.designpattern;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
	private List<String> vList;
	
	public Vehicle() {
		this.vList = new ArrayList<String>();
	}
	public Vehicle(List<String> list) {
		this.vList = list;
	}
	
	public void insert() {
		vList.add("f");
		vList.add("s");
		vList.add("t");
		vList.add("fo");
	}
	
	public List<String> getVehicleList(){
		return vList;
	}
	
	public Vehicle flone(){
		List<String> tempList = new ArrayList<String>();
		
		for(String s:this.getVehicleList()) {
			tempList.add(s);
		}
		return new Vehicle(tempList);
	}
	
	
}
public class Prototype {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle();
		v.insert();
		
		Vehicle v1 = v.flone();
		List<String> list = v1.getVehicleList();
		list.add("fi");
		
		System.out.println(list);
		v.getVehicleList().remove("f");
		System.out.println(v.getVehicleList());
		System.out.println(list);
	}

}






