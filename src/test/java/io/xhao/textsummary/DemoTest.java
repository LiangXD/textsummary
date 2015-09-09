package io.xhao.textsummary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import io.xhao.textsummary.ArticleReader;
import io.xhao.textsummary.Strategy;

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
