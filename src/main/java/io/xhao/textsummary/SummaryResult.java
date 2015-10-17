package io.xhao.textsummary;

import java.util.ArrayList;
import java.util.List;

public interface SummaryResult {

	default List<String> getLines() {
		return new ArrayList<>();
	}

	default void addLine(String content) {
		// NOP
	}

	public static final SummaryResult NoSummaryResult = new SummaryResult() {
	};
}