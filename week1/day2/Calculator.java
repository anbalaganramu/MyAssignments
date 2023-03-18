package week1.day2;

public class Calculator {
	public int add(int a,int b, int c) {
		return a+b+c;
	}
	
	public int mul(int x, int y) {
		return x*y;
	}
	
	public void sub() {
		System.out.println("Nothing to print");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj= new Calculator();
		System.out.println(obj.add(5, 15, 5));
		System.out.println(obj.mul(20, 20));
		obj.sub();
			
	}

}
