package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 21;
		boolean prime = true;
		for (int i = 2; i < num; i++) {
			if (num%i==0) {
				prime = false;
				break;				
			}		
			
		}
		
		System.out.println(prime);
	
	}

}
