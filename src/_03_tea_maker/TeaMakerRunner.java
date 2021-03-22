package _03_tea_maker;

public class TeaMakerRunner {
public static void main(String[] args) {
	
	
	TeaBag bag = new TeaBag("mint");
	System.out.println(bag.getFlavor());

	Kettle kettle = new Kettle();
	kettle.boil();
	
	
	
	
	
	Cup cup = new Cup();
	
	cup.makeTea(bag, kettle.getWater());
	
	
	


	
	
	
}
}
