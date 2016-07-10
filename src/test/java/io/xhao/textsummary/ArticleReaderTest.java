package io.xhao.textsummary;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.xhao.textsummary.strategy.Strategy;

public class ArticleReaderTest {

	@Test
	public void defaultStrategyTest() {
		String filePath = ClassLoader.getSystemResource("license.txt").getFile();
		SummaryResult result = new ArticleReader(Strategy.Default).read(filePath);
		Assert.assertEquals(result.getLines().size(), 3);
	}
}
