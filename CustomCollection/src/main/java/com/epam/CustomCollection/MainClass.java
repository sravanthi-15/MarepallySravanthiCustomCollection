package com.epam.CustomCollection;

public class MainClass {
	public static void main(String[] args) 
    {
		CustomList<Integer> list = new CustomList<>(); 
        //insert elements
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        
        System.out.println(list);
         
        //Removes elements from the list
        list.remove(4);
        System.out.println(list);
         
        //Get element with index
        System.out.println( list.get(0) );
        System.out.println( list.get(1) );
 
        //List Size
        System.out.println(list.size());
    }
	

}
