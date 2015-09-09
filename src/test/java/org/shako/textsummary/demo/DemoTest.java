package org.shako.textsummary.demo;

import org.shako.textsummary.ArticleReader;
import org.shako.textsummary.Strategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class DemoTest {

	private static Logger log = LoggerFactory.getLogger(DemoTest.class);

	/**
	 * default strategy
	 * 
	 * @param args
	 */
	@Test
	public void test() {
		new ArticleReader(Strategy.Default).read("src/test/resources/demo").getLines().forEach(line -> {
			log.debug(line);
		});
	}

}
