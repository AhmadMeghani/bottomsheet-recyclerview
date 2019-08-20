package com.abcx.recyclerview;

public class listItem {

    private String Heading;
    private String Description;

    public listItem(String heading, String description) {
        Heading = heading;
        Description = description;
    }

    public String getHeading() {
        return Heading;
    }

    public String getDescription() {
        return Description;
    }
}
