package com.acc.lkm.mavendemo;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	NavigableMap<Integer,String> map=new TreeMap<Integer,String>();  
    	map.put(10,"Mango");
    	map.put(20,"Apple");
    	map.put(5,"Banana");
    	map.put(3,"Banana");
    	System.out.println("Elements in descending order"+map.descendingMap());
    	
    	
    	
        
    }
}
