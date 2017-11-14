package com.sumeragizzz.statementdownloader.biz.service;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;

import com.sumeragizzz.statementdownloader.biz.crawler.SampleCrawler;

import edu.uci.ics.crawler4j.crawler.CrawlConfig;
import edu.uci.ics.crawler4j.crawler.CrawlController;
import edu.uci.ics.crawler4j.fetcher.PageFetcher;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtConfig;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtServer;

@RequestScoped
public class CrawlerService implements Serializable {

    public void crawl() {
        CrawlConfig config = new CrawlConfig();
        config.setCrawlStorageFolder("C:/Development/appdata/statement-downloader");
        config.setIncludeHttpsPages(true);
        config.setMaxDepthOfCrawling(0);

        PageFetcher pageFetcher = new PageFetcher(config);
        RobotstxtConfig robotstxtConfig = new RobotstxtConfig();
        RobotstxtServer robotstxtServer = new RobotstxtServer(robotstxtConfig, pageFetcher);
        CrawlController controller;
        try {
            controller = new CrawlController(config, pageFetcher, robotstxtServer);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        controller.addSeed("https://www.apple.com/jp/");

        controller.start(SampleCrawler.class, 1);
    }

}
