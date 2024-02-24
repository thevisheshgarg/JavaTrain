package com.edu.MavenTest;

public class App 
{
    public static void main( String[] args )
    {
       String input = "12345";
       System.out.println(Integer.parseInt(input));
       String y = "Vishesh";
       System.out.println(y.hashCode());
       switch(y){
    	   case "Vishesh": 
    		   System.out.println("Matched");
    		   break;
    		default: 
    			System.out.println("Not matched");
    			break;
       }
    }
}
