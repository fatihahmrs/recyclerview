package com.example.recyclerview;

public class Version {
    private String name;
    private String desc;
    private String icon;

    public Version(String name, String desc, String icon) {
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

    public String getIcon() {
        return icon;
    }
}
