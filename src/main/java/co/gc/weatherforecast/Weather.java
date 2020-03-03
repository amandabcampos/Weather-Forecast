package co.gc.weatherforecast;

import java.util.List;

public class Weather {
	
	private Location location;
	private Data data;
	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Weather [location=" + location + ", data=" + data + "]";
	}
	
	
	
	

}
