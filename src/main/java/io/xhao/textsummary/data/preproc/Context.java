package io.xhao.textsummary.data.preproc;

import io.xhao.textsummary.data.Article;

public class Context {

	private Article article;

	public Context() {
		article = new Article();
	}

	public Article getArticle() {
		return article;
	}

}
