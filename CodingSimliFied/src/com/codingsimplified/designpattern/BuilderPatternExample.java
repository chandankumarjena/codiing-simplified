package com.codingsimplified.designpattern;

class MyVehicle{
	private String engine;
	private int wheel;
	private int airBag;
	
	public String getEngine() {
		return engine;
	}
	public int getWheel() {
		return wheel;
	}
	public int getAirBag() {
		return airBag;
	}
	public MyVehicle(MyVehicleBuilder builder) {
		 this.engine = builder.engine;
		 this.wheel = builder.wheel;
		 this.airBag = builder.airBag;
	}
	
	@Override
	public String toString() {
		return "MyVehicle [engine=" + engine + ", wheel=" + wheel + ", airBag=" + airBag + "]";
	}

	public static class MyVehicleBuilder{
		private String engine;
		private int wheel;
		private int airBag;
		public MyVehicleBuilder(String engine, int wheel) {
			this.engine = engine;
			this.wheel = wheel;
		}
		public MyVehicleBuilder setAirBag(int airBag) {
			this.airBag = airBag;
			return this;
		}
		
		public MyVehicle build() {
			return new MyVehicle(this);
		}
	}
	
}
public class BuilderPatternExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyVehicle myVehicle1 = new MyVehicle.MyVehicleBuilder("1200cc", 4).build();
		MyVehicle myVehicle2 = new MyVehicle.MyVehicleBuilder("1300cc", 3).setAirBag(3).build();
		System.out.println(myVehicle1);
		System.out.println(myVehicle2);
	}

}
