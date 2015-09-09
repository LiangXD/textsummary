package io.xhao.textsummary.analyze;

import java.util.List;

import io.xhao.textsummary.data.Article;
import io.xhao.textsummary.data.Token;

public class Analyzer {

	private Graph graph;

	public void initEnv(Article article) {
		graph = new Graph();
		graph.initEnv(article);
	}

	public List<Token> process() {
		return graph.process();
	}
}
