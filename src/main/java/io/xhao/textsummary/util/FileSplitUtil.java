package io.xhao.textsummary.util;

import java.util.HashSet;

/**
 * thread not safe
 * 
 * @author xiehao
 *
 */
public class FileSplitUtil {

	private char[] content;
	private boolean start = false;
	private int offset = 0;
	
	private HashSet spliter = new HashSet();

	public void split(String message) {
		start = true;
		content = message.toCharArray();
	}

	public String read() {
		if (start) {
			int count = 0;

			return String.valueOf(content, offset, count);
		} else {
			return "";
		}
	}

	public void clear() {
		offset = 0;
		start = false;
		content = null;
	}

}
