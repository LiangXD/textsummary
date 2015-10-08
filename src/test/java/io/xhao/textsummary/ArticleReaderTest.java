package io.xhao.textsummary;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.xhao.textsummary.strategy.Strategy;

public class ArticleReaderTest {

	@Test
	public void readerTest() {
		SummaryResult result = new ArticleReader(Strategy.Default).read("license.txt");
		Assert.assertSame(result, SummaryResult.NoSummaryResult);
	}

	@Test
	public void defaultStrategyTest() {
		String filePath = ClassLoader.getSystemResource("license.txt").getFile();
		SummaryResult result = new ArticleReader(Strategy.Default).read(filePath);
		Assert.assertEquals(result.getLines().size(), 3);
		System.out.println(result.getLines().get(2));
	}
}
