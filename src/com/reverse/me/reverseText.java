package com.reverse.me;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;  
import java.io.FileReader;  
import java.io.BufferedReader;  
import java.io.FileNotFoundException;  
import java.util.*;  
import java.io.FileWriter;

public class reverseText {

	 public static void main(String[] args) throws IOException,FileNotFoundException { 
	     
	       
	    	FileReader readFile=new FileReader("C:\\Users\\Andrew\\Desktop\\QA Class\\inOrder.txt");  
	        BufferedReader buffer=new BufferedReader(readFile);  
	        String line;  
	  
	        List<String> temp = new ArrayList<String>();  
	        
	        while ( (line = buffer.readLine()) != null ) {    
			
	        	temp.add(line);  
	   }  
	        buffer.close();
	       
	        
	 
				
	 
				File file = new File("C:\\Users\\Andrew\\Desktop\\QA Class\\reverseOrder.txt");
	 
				// if the file above does not exist.
				if (!file.exists()) {
					file.createNewFile();
				}
	 
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				for(int i=temp.size()-1;i>=0;i--) {  
				        bw.write(temp.get(i));
				        if(i == 0){
				        bw.close();	
				        }
				        else
				        bw.newLine();	
				        }  
			
	 
	               
	               System.out.println("Done reversing...");
	 
			
		}
	    }  

