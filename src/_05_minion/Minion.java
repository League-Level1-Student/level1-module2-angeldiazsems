package _05_minion;

public class Minion {
String name = "Jake";
int eyes = 1;	
String color = "Yellow";	
String master = "Gru";

public Minion(String name,int eyes, String color,String master) {

	this.name = name;
	this.eyes = eyes;
	this.color = color;
	this.master = master;
	
}
	
	public String getName() {
		return name;
	}
	
	public int getEyes() {
		return eyes;
	}
	public String getColor() {
		return color;
	}
	public String getMaster() {
		return master;
	}
	public void setMaster(String master) {
		this.master = master;
	}
	
	





}
