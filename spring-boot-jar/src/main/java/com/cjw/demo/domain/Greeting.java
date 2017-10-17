package com.cjw.demo.domain;

/**
 * Created by 828471 on 2017/7/17.
 */
public class Greeting {
    private final long id;
    private final String context;

    public Greeting(long id, String context) {
        this.id = id;
        this.context = context;
    }

    public long getId() {
        return id;
    }

    public String getContext() {
        return context;
    }
}
