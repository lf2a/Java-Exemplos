package com.lf2a.Java_Examples;

import java.io.File;
import java.util.ArrayList;

public class FileTest {
	public static void main(String[] args) {
		try {
			File file = new File(
					"/Java-Examples/src/main/java/com/lf2a/Java_Examples/File");
			if (file.isFile()) {
				System.out.println(file.toString());
				System.out.println(file.canRead() ? "true" : "false");
				System.out.println(file.canWrite() ? "true" : "false");
				System.out.println(file.length() + " bytes");
			} else {
				File[] files = file.listFiles();
				ArrayList<File> fileList = new ArrayList<File>();
				for (int i = 0; i < files.length; i++) {

					if (files[i].isDirectory()) {
						System.out.println("[" + files[i].getPath() + "]");
					} else {
						fileList.add(files[i]);
					}
				}

				for (File f : fileList) {
					System.out.println(f.toString());
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}
}
