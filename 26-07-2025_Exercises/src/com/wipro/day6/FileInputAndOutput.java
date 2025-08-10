package com.wipro.day6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputAndOutput {
	public static void main(String[] args) {
		String sourcePath = "C:\\java_logo.jpg";
        String destPath = "C:\\java_logo_output.jpg";

        try (
            FileInputStream inputStream = new FileInputStream(sourcePath);
            FileOutputStream outputStream = new FileOutputStream(destPath)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read and write the file in chunks
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            System.out.println("Image copied successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while copying the image:");
            e.printStackTrace();
        }
	}

}
