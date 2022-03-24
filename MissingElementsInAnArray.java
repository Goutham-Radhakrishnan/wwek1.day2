package week1day2;

import java.util.Arrays;

public class MissingElementsInAnArray {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,6,8,7};
		int j=0;
		
		Arrays.sort(arr);
		
		for(int i=0;i <= arr.length ; i++) {
			j=j+1;
			if(j!= arr[i]) {
				System.out.println(j);
				break;
			}
		}
	}

}
