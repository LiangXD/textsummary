package io.xhao.textsummary.strategy;

import java.util.Arrays;
import java.util.List;

import io.xhao.textsummary.SummaryResult;

public interface Strategy {

	boolean endReading();

	void preProcess(int lineNumber, String content);

	SummaryResult process();

	/**
	 * get lines between one to three(at most 3 lines)
	 */
	public Strategy Default = new Strategy() {
		private static final int Max_Lines = 3;

		private boolean endReading = false;

		private final SummaryResult result = new SummaryResult() {
			private String[] lines = new String[3];
			private int index = 0;

			public void addLine(String line) {
				lines[index++] = line;
			}

			@Override
			public List<String> getLines() {
				return Arrays.asList(lines);
			}
		};

		public boolean endReading() {
			return endReading;
		}

		public void preProcess(int lineNumber, String content) {
			if (content == null || content.trim().length() == 0) {
				return;
			}

			if (lineNumber <= Max_Lines) {
				result.addLine(content);
			} else {
				endReading = true;
			}
		}

		public SummaryResult process() {
			return result;
		}
	};
}
