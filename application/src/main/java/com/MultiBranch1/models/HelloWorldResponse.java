package com.MultiBranch1.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HelloWorldResponse
{
    @JsonProperty("hello")
    private final String name;

    public HelloWorldResponse( final String name ) {
        this.name = name;
    }
}
