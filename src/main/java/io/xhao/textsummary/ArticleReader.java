package io.xhao.textsummary;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.xhao.textsummary.strategy.Strategy;

public class ArticleReader {
	private static Logger log = LoggerFactory.getLogger(ArticleReader.class);
	private Strategy strategy;

	public ArticleReader(Strategy strategy) {
		this.strategy = strategy;
	}

	public SummaryResult read(String filePath) {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(filePath));
			String s;
			int lineNumber = 1;
			SentenceReader reader = new SentenceReader();

			while ((s = in.readLine()) != null && !strategy.endReading()) {
				// 以sentence为单位处理文本
				reader.read(s);
				// 存储并处理sentence
				while (reader.remain() && !strategy.endReading()) {
					Sentence line = reader.next();
					strategy.preProcess(lineNumber, line);
				}
			}
			// 分析
			return strategy.process();
		} catch (FileNotFoundException e) {
			log.warn("File: {} not found!", filePath);
		} catch (IOException e) {
			log.warn(e.getMessage(), e);
		} finally {
			if (in != null)
				try {
					in.close();
				} catch (IOException e) {
					in = null;
				}
		}
		return new SummaryResult();
	}
}
