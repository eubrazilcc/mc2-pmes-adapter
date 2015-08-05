package br.lncc.sinapad.adapter.bes.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;

public class BesUtils {
	// Gets a string array and converts it to one string
	public static String stringArrayToString(String[] path) {
		String finalPath = "";
		for (String s : path) {
			if (s != null && finalPath.equals("")) {
				finalPath = s + File.separator;
			} else if (s != null && !finalPath.equals("")) {
				finalPath += s + File.separator;
			}
		}
		return finalPath;
	}

	public static String stringArrayToHTMLString(String[] path) {
		String finalPath = "";
		for (String s : path) {
			if (s != null && finalPath.equals("")) {
				finalPath = s + "/";
			} else if (s != null && !finalPath.equals("")) {
				finalPath += s + "/";
			}
		}

		return StringUtils.removeEnd(finalPath, "/");
	}

	// converts a date written as a string to Date
	public static Date stringToDate(String d) {
		DateFormat formatter = new SimpleDateFormat("EEE MMM dd hh:mm:s", Locale.US);
		try {
			if (d.equals("")) {
				return null;
			} else {
				return (Date) formatter.parse(d);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static byte[] getBytes(InputStream is) throws IOException {

		int len;
		int size = 1024;
		byte[] buf;

		if (is instanceof ByteArrayInputStream) {
			size = is.available();
			buf = new byte[size];
			len = is.read(buf, 0, size);
		} else {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			buf = new byte[size];
			while ((len = is.read(buf, 0, size)) != -1)
				bos.write(buf, 0, len);
			buf = bos.toByteArray();
		}
		return buf;
	}
}
