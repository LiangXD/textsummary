package io.xhao.textsummary;

import java.util.List;

/**
 * 
 * @author xiehao
 *
 */
class SentenceReader {

	private int count;
	private List<Sentence> sentences;
	private String lastPiece;

	public void read(String s) {
		final int max = s.length();
		for (int i = 0; i < max; i++) {
			int ch = s.charAt(i);
		}
	}

	public boolean remain() {
		return true;
	}

	public void write(Sentence[] dest) {

	}

	public void clear() {
		count = 0;
		lastPiece = null;
	}

	public Sentence next() {
		if (sentences.size() > 0) {
			return sentences.remove(0);
		}
		return null;
	}
}