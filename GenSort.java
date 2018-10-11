/*
Author: Adam Carling
Date: Wed, October 10th, 7:40 AM
This program will take an ArrayList and sort it in acending order. 
*/

import java.util.*;

class GenSort {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(114);
		list.add(4);
		list.add(12);
		list.add(23);
		list.add(55);
		list.add(24);
		sort(list);
	}//End Main Method

	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		ArrayList<E> newList = new ArrayList<E>();
		newList = list;
		for (int j = 0; j < list.size()-1; j++){
			for(int i = 0; i < list.size()-1; i++){
				if (newList.get(i).compareTo(newList.get(i +1)) < 0){
				}else{
					E sub = newList.get(i);
					newList.set(i, newList.get(i +1));
					newList.set(i +1, sub);
				}//End If Else
			}//End I for Loop
		}//End J for Loop
		System.out.print(newList);
	}//End Sort Method
}//End Class