package com.example.dogevents;

import wse.generated.definitions.Turbo_DBSchema;

public final class Session {

    private static String username;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Session.username = username;
    }
}

