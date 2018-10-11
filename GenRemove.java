/*
Author: Adam Carling
Date: Fri. 10/5/18 7:36 AM 
This code makes a generic list, adds four Integers then removes the duplicates.
*/
import java.util.*;

class GenRemove {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(14);
		list.add(24);
		list.add(14);
		list.add(34);
		removeDuplicates(list);
	}//End Main Method
	
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		ArrayList<E> newList = new ArrayList<>();
		for(E e: list){
			if(!newList.contains(e)){
				newList.add(e);
			}//End If
		}//End For Loop
		System.out.println(newList);
		return newList;
	}//End Method
}//End Class