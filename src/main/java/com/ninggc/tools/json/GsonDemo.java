package com.ninggc.tools.json;

import com.ninggc.tools.interfaces.IGson;

public class GsonDemo implements IGson {
    public static void main(String[] args) {
        System.out.println(gson.toJson("Hello World".split(" ")));
    }
}
