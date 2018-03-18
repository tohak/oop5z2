package oop5z2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileOperation {
	public static File createFile() {
		System.out.println("Input name File");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Input text,what to write in the file");
		String text = sc.nextLine();

		File file = new File(name);
		try {
			file.createNewFile();

		} catch (IOException e) {
			System.out.println("Dont create file ");
		}
		writeToFile(file, text);
		return file;
	}

	public static String[] fileToText(File file) {
		String text = "";
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			for (; (text = br.readLine()) != null;)
				System.out.println(text);
		} catch (IOException e) {
			System.out.println(" Error, write file");
		}
		
		try {String textArray[] = text.split(" ");
		return textArray;	
		} catch (NullPointerException e) {
			System.out.println("Error, text=null");
		}					
		return null;			
	}

	public static void writeToFile(File nameFile, String text) {
		try (PrintWriter textToFile = new PrintWriter(nameFile)) {
			textToFile.println(text);
		} catch (FileNotFoundException e) {
			System.out.println("Error, file write");
		}
	}
}
