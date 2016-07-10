package io.xhao.textsummary;

public class Sentence {

	private String content;
	private SentenceCategory cate;

	public Sentence(String content, SentenceCategory category) {
		this.content = content;
		this.cate = category;
	}

	public String value() {
		return content;
	}

	public boolean isDeclare() {
		return cate == SentenceCategory.DECLARE;
	}

	// *//**
	// * id in article
	// *//*
	// private int identity;
	// private HashMap<Token, Integer> tokens;
	//
	// *//**
	// *
	// * @param identity
	// *//*
	// public Sentence(int identity) {
	// this.identity = identity;
	// tokens = new HashMap<Token, Integer>();
	// }
	//
	// public void addToken(Token data) {
	// if(!isContainToken(data)) {
	// this.tokens.put(data, new Integer(1));
	// } else {
	// this.tokens.get(data)1;
	// }
	// }
	//
	// public boolean isContainToken(Token data) {
	// return this.tokens.containsKey(data);
	// }

}
