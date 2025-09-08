package com.example.fit_life;
public class YogaPose {
    private String name;
    private String shortDescription;
    private int imageResource;
    private String fullDescription; // Add full description

    // ✅ Correct Constructor
    public YogaPose(String name, String shortDescription, int imageResource, String fullDescription) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.imageResource = imageResource;
        this.fullDescription = fullDescription;
    }

    // ✅ Getter Methods
    public String getName() { return name; }
    public String getShortDescription() { return shortDescription; }
    public int getImageResource() { return imageResource; }
    public String getFullDescription() { return fullDescription; }
}
