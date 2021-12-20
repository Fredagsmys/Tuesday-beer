package com.example.betygsttalkoholen;

public final class Session {

    private static String username;
    private static String sessionID;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Session.username = username;
    }

    public static String getSessionID() {
        return sessionID;
    }

    public static void setSessionID(String sessionID) {
        Session.sessionID = sessionID;
    }
}

