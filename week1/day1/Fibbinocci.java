package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int y=1;
		int sum=0;
		System.out.println(x);
		for (int i = 1; i <= 11; i++) {
			sum=x+y;
			x=y;
			y=sum;
			System.out.println(sum);
			}
		}
	}
