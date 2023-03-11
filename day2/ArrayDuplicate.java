package week1.day2;

public class ArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {2,3,5,6,6,7,7,9,10,2};
		int count=numbers.length;
		
		for(int i=0;i<count;i++) {
			for(int j=i+1;j<count;j++) {
				if(numbers[i]==numbers[j]) {
					System.out.println(i);
				}
			}
		}
	}

}
