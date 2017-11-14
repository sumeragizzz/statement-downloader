package com.sumeragizzz.statementdownloader.biz.crawler;

import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import edu.uci.ics.crawler4j.url.WebURL;

public class SampleCrawler extends WebCrawler {

    @Override
    public boolean shouldVisit(Page referringPage, WebURL url) {
        return url.getURL().startsWith("https://www.apple.com/jp/") && url.getURL().endsWith("html");
    }

    @Override
    public void visit(Page page) {
        logger.info(String.format("**** %s ****%n", page.getWebURL().getURL()));
    }

}
