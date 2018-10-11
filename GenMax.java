/*
Author: Adam Carling
Date: October 8, 2018, Mon 7:41
Program takes and array of Integers and find the highest number.
*/
import java.util.*;

class GanMax {
	public static void main(String[] args) {
		Integer[] list = new Integer[4];
		list[0] = 14;
		list[1] = 12;
		list[2] = 24;
		list[3] = 34;
		max(list);
	}//End Main Method
	
	public static <E extends Comparable<E>> E max(E[] list){
		E maxNum = list[0];
		for(E e: list){
			if (maxNum.compareTo(e) < 0) {
				maxNum = e;
			}//End if
		}//End For
		System.out.print("The max Number in the array is: " + maxNum);
		return maxNum;
	}//End Max Method
}//End Class