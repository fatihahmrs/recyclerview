package com.example.recyclerview;

public class Version {
    private String name;
    private String desc;
    private int icon;

    public Version(String name, String desc, int icon) {
        this.name = name;
        this.desc = desc;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getIcon() {
        return icon;
    }
}
