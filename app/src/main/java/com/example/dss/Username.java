package com.example.dss;

public class Username {
    private String User;

    private static Username id = null;

    private Username(String name) {
        this.User = name;
    }

    public static void setName(String name) {

            id = new Username(name);
    }

    public static String getName()
    {
        return id.User;
    }
}
