package com.lessons.es;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App
{
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args ) throws Exception
    {
        logger.debug("And so it begins...");

        ElasticSearchService esService = new ElasticSearchService("");
        String result = esService.runSearch("");
        logger.debug("Result {}", result);


    }
}
