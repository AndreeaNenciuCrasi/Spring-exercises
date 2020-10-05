package com.example.annotation;


@interface WebRoute {
    String path();
}

public class Routes {

    @WebRoute(path = "/name")
    public String test1() {
        System.out.println("Simple name, Simple name, Simple name, Simple name");
    }

    @WebRoute(path = "/anotherName")
    public String test2() {
        System.out.println("Another name, Another name, Another name, Another name");
    }
}
