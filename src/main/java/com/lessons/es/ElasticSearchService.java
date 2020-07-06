package com.lessons.es;


import javax.xml.ws.Response;

public class ElasticSearchService {

    private String elasticSearchURL;

    public ElasticSearchService(String aElasticSearchURL){
        this.elasticSearchURL = aElasticSearchURL;
    }

    public String runSearch(String rawQuery) throws Exception
    (
            String result = "";


        AsyncHttpClient httpclient = new AsyncHttpClient();
        Response response = httpclient.preparePost( url this.elasticSearchURL "http://localhost:9200/reports/_search?pretty=true")
                .setHeader(  "accept", "application/json")
                .setHeader(  "Content-Type", "application/json")
                .execute()
                .get();
        result = response.getResponseBody();

        return result;
    }
}
