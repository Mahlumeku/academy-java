package com.bptn.course._23_file_handlimg_basics;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) {

		try {
			FileWriter writer = new FileWriter("sample.txt");
			writer.write("This is a new file!");
			System.out.println("file created!");
			writer.close();

		} catch (IOException e) {
			System.out.println("Something went wroung while creating the file:");
			e.printStackTrace();
		}
	}

}
