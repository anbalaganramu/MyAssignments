package week1.day2;

import java.util.Arrays;

public class SortArray {
 public static void main(String[] args) {
	String[] alpha= {"Zabia","Chitra","Umash","Beema","Anbu"};
	Arrays.sort(alpha);
	System.out.println("Names are:");
	for(int i=0;i<alpha.length;i++) {
		System.out.println(alpha[i]);
	}
}
}
