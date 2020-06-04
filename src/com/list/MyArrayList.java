package com.list;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    
	   // To access an element in the ArrayList, use the get() method and refer to the index number:

	    
	    System.out.println("print after get(0) " + cars.get(0) );
	    
	   //To modify an element, use the set() method and refer to the index number
	    
	    cars.set(0, "Opel");
	    
	   System.out.println("print after set " + cars);
	    
	   //To remove an element, use the remove() method and refer to the index number:
	    
	    cars.remove(0);
	    
	    System.out.println("print after remove " + cars);
	    
	    
	   //To remove all the elements in the ArrayList, use the clear() method: 
	    cars.clear();
	    
	  //To find out how many elements an ArrayList have, use the size method:
	    cars.size(); 
	    
	    
	    
	}

}
