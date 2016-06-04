package com.deepak;

import java.io.File;
import java.util.ArrayList;

public class CDMain {

	public static void main(String[] args) {
		System.out.println("last op="+cd("/var/www/www","../../bin/../ftp"));

	}

	public static String cd(String currentPath, String newPath){
		if(newPath.equals("/")){
			return "/";
			
		}
		
		String[] newPathArray = newPath.split("/");
		String[] currentPathArray= currentPath.split("/");
		
		ArrayList arr= new ArrayList<String>();
		
		//get the array into one arraylist
		for(int i=1;i<currentPathArray.length;i++){
			arr.add(currentPathArray[i]);
			}
		for(int i=0;i<newPathArray.length;i++){
			arr.add(newPathArray[i]);
			}
		
		//remove the .. and prev node
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).equals("..")){
				arr.remove(i); //..
				arr.remove(i-1); //prev element
				i=0;
			}
		}
		StringBuilder sb = new StringBuilder("/");
		for(int i=0;i<arr.size();i++){
			sb.append(arr.get(i)+"/");
		}
		return sb.toString();
		
	}
}
	

