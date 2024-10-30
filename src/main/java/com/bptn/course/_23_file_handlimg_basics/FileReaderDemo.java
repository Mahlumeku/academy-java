package com.bptn.course._23_file_handlimg_basics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws FileNotFoundException {

		FileReader reader = new FileReader("Sample.txt");
		try (BufferedReader bufferedReader = new BufferedReader(reader)) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);

			}
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			System.out.println("Something went wrong while creating the file:" + e.getMessage());
			e.printStackTrace();
		}
	}

}
