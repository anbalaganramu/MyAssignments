package week1.day2;

public class Bicycle {
	
	public int cycleCount() {
		return 3;
	}
	
	public String cycleColor(String color) {
		// TODO Auto-generated method stub
		return color;
	}
	
	public String cycleBrand(String brand) {
		// TODO Auto-generated method stub
		return brand;
	}
	
	public void checkIs() {
		System.out.println("Nothing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle obj=new Bicycle();
		System.out.println(obj.cycleCount());
		System.out.println(obj.cycleBrand("Hero"));
		System.out.println(obj.cycleColor("Blue"));
		obj.checkIs();
	}
	
	
}
