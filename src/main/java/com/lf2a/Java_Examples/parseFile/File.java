package com.lf2a.Java_Examples.parseFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public final class File {
	public static final char[] read(String path) {
		String str = "";

		try {
			FileInputStream fis = new FileInputStream(path);
			BufferedInputStream bis = new BufferedInputStream(fis);

			int i;
			while ((i = bis.read()) != -1) {
				str += (char) i;
			}

			fis.close();
			bis.close();

		} catch (FileNotFoundException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		} catch (Exception e) {
			System.err.println(e);
		}

		return str.toCharArray();
	}

	public static final void write(String path, String content) {

		try {
			FileOutputStream fos = new FileOutputStream(path);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			byte b[] = content.getBytes();
			bos.write(b);
			bos.flush();

			fos.close();
			bos.close();

		} catch (IOException e) {
			System.err.println(e);
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
