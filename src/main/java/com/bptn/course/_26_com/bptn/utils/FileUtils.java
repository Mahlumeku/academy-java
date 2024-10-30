package com.bptn.course._26_com.bptn.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileUtils {

	public static void main(String[] args) {
		FileUtils fileUtils = new FileUtils();

		String DIRECTORY_PATH = System.getProperty("user.dir") + "/";

		String filePath = DIRECTORY_PATH + "test.txt";

		System.out.println(filePath);

		fileUtils.writeFile(Paths.get(filePath));
		fileUtils.updateFile(Paths.get(filePath));
		fileUtils.readFile(Paths.get(filePath));
		fileUtils.deleteFile(Paths.get(filePath));
	}

	// the isFileExist() method should be here
	public boolean isFileExists(Path path) {
		if (Files.exists(path)) {
			System.out.println("File exists!");
			return true;
		} else {
			System.out.println("File doesn't exists!");
			return false;
		}
	}

	// the isFileExistsWithExceptionHandling() should be here

	public boolean isFileExistsWithExceptionHandling(Path path) {
		File file = new File(path.toUri());

		try (Scanner scanner = new Scanner(file)) {
			scanner.nextLine();
			System.out.println("File Exists!");

		} catch (FileNotFoundException e) {
			System.out.println("File doesn't exist!");
		}
		return false;
	}

	// the createFileIfNotExist() method should be here

	public boolean createFileIfNotExist(Path path) {
		try {
			if (!Files.exists(path)) {
				Files.createFile(path);
				System.out.println("File created!");
			} else {
				System.out.println("File already exists!");
			}
			return Files.exists(path);
		} catch (IOException e) {
			System.out.println("An error occurred while creating the file: " + e.getMessage());
			return false;
		}
	}

	// define readFile()
	public void readFile(Path path) {
		if (isFileExists(path)) {
			try (Scanner scanner = new Scanner(new File(path.toUri()))) {
				while (scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				}
			} catch (FileNotFoundException e) {
				System.out.println("An error occurred while reading the file: " + e.getMessage());
			}
		}
	}

	// define deleteFile()
	public void deleteFile(Path path) {
		if (isFileExists(path)) {
			try {
				Files.delete(path);
				System.out.println("File deleted!");
			} catch (IOException e) {
				System.out.println("An error occurred while deleting the file: " + e.getMessage());
			}
		}
	}

	// define writeFile()

	public void writeFile(Path path) {
		if (isFileExists(path)) {
			try (FileWriter writer = new FileWriter(new File(path.toUri()))) {
				writer.write("text 4\n");
				writer.write("text 5\n");
				System.out.println("File overwritten with new content!");
			} catch (IOException e) {
				System.out.println("An error occurred while writing to the file: " + e.getMessage());
			}
		}
	}

	// define updateFile()

	public void updateFile(Path path) {
		if (isFileExists(path)) {
			try (FileWriter writer = new FileWriter(new File(path.toUri()), true)) {
				writer.write("text 6\n");
				writer.write("text 7\n");
				System.out.println("File updated with new content!");
			} catch (IOException e) {
				System.out.println("An error occurred while updating the file: " + e.getMessage());
			}
		}
	}
}