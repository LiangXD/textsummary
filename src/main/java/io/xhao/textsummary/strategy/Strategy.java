package io.xhao.textsummary.strategy;

import io.xhao.textsummary.Sentence;
import io.xhao.textsummary.SummaryResult;

public interface Strategy {

	default boolean endReading() {
		return false;
	};

	default void preProcess(int lineNumber, Sentence line) {
	};

	SummaryResult process(Sentence);

	/**
	 * get lines between one to three(at most 3 lines)
	 */
	public Strategy Default = new Strategy() {
		private static final int Max_Lines = 2;

		private boolean endReading = false;

		private final SummaryResult result = new SummaryResult() ;

		public boolean endReading() {
			return endReading;
		}

		public void preProcess(int lineNumber, Sentence content) {
			if (content == null || content.value() == null) {
				return;
			}

			if (lineNumber <= Max_Lines) {
				result.addLine(content.value());
			} else {
				endReading = true;
			}
		}

		public SummaryResult process() {
			return result;
		}
	};
}
