package com.bptn.course._23_file_handlimg_basics;

import java.io.File;

public class FileDeleteDemo {

	public static void main(String[] args) {

		File file = new File("smaple.txt");
		if (file.exists()) {
			System.out.println("File found! Deleting now");
		}
		if (file.delete()) {
			System.out.println("file deleted");
		} else {
			System.out.println("File not found!");
		}

	}

}
