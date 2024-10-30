package com.bptn.course._23_file_handlimg_basics;

import java.io.FileWriter;
import java.io.IOException;

public class FileUpdateDemo {

	public static void main(String[] args) {

		try {
			FileWriter writer = new FileWriter("sample.txt", true);
			writer.write("This is a new file!");
			writer.write("This is an existing file!");
			System.out.println("file created!");
			writer.close();

		} catch (IOException e) {
			System.out.println("Something went wroung while creating the file:");
			e.printStackTrace();
		}

	}

}
