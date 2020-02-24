package com.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {

	public static void main(String[] args) throws IOException {
		
		String datalocation = "/Users/waquaralam/Automation_Addons/links.txt";
	  
	        // attach a file to FileWriter  
		    FileReader fr = new FileReader(datalocation);
			BufferedReader br = new BufferedReader(fr);
			String linetext = null;			  
			
			FileWriter fw = new FileWriter("/Users/waquaralam/Automation_Addons/linkscopied.txt");
			
	        while ((linetext = br.readLine()) != null ) {
	        	fw.write(linetext);
				System.out.println(linetext);
			}
			br.close();
			
	        System.out.println("Writing successful"); 
	        //close the file  
	        fw.close(); 
	}

}
