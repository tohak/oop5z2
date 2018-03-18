package oop5z2;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File fileOne = FileOperation.createFile();
		File fileTho = FileOperation.createFile();
		File fileThree = FileOperation.createFile();
		
		String [] arrayOne=FileOperation.fileToText(fileOne);
		String [] arrayTho= FileOperation.fileToText(fileTho);
		String temp="";
		for (int i = 0; i < arrayOne.length; i++) {
			for (int j = 0; j < arrayTho.length; j++) {
				if (arrayOne[i].equals(arrayTho[j])) {
					temp=temp+arrayOne[i]+" ";
				}
			}
		}
		FileOperation.writeToFile(fileThree, temp);
		
		
	}

}
