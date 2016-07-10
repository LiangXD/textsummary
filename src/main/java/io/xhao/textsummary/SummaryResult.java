package io.xhao.textsummary;

import java.util.ArrayList;
import java.util.List;

public class SummaryResult {

	private List<String> contents = new ArrayList<>(4);

	public List<String> getLines() {
		return contents;
	}

	void addLine(String content) {
		contents.add(content);
	}
}