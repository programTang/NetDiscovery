package com.cv4j.netdiscovery.core.queue;

import com.cv4j.netdiscovery.core.domain.Request;

/**
 * Created by tony on 2018/1/1.
 */
public interface Queue {

    /**
     * add a url to fetch
     *
     * @param request request
     */
    void push(Request request);

    /**
     * get an url to crawl
     * @param spiderName
     * @return the url to spider
     */
    Request poll(String spiderName);

    /**
     *
     * @param spiderName
     * @return
     */
    int getLeftRequests(String spiderName);

    /**
     *
     * @param spiderName
     * @return
     */
    int getTotalRequests(String spiderName);
}
