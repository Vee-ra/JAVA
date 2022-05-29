package com.OOP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
		
		File file = new File("C:\\test\\abc.txt"); //checking a file
		
		if(file.exists()) {
			System.out.println("file exist");
		}else {
			System.out.println("file doesn't exist");
		}
		System.out.println("---------");
		
		File file1 = new File("C:\\test\\abc.txt"); //create a file
		
		try {
			if(file1.createNewFile()) {
				System.out.println("File Created");
			} else {
				System.out.println("file exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("---------");
		
		File file2 = new File("C:\\test\\abc.txt"); //Reading from a file
		
		try {
			Scanner scanner = new Scanner(file2);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} System.out.println("------");
		
		try {
			FileWriter filewriter = new FileWriter("C:\\test\\abc.txt"); //Written to a file
			filewriter.append("veera"); //filewriter.write
			filewriter.close();
			System.out.println("successfully writing to file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		


	}

}
