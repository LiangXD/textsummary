package io.xhao.textsummary;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.xhao.textsummary.strategy.Strategy;
import io.xhao.textsummary.util.FileSplitUtil;

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
			int line = 1;
			FileSplitUtil util = new FileSplitUtil();
			while ((s = in.readLine()) != null && !strategy.endReading()) {
				
			}

			int i = 0;

			for (; (s = in.readLine()) != null && !strategy.endReading(); i++) {
				// TODO read data from s;
				strategy.preProcess(i, s);
			}
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
		return SummaryResult.NoSummaryResult;
	}
}
