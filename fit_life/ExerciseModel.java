//package com.example.fit_life;
//
//public class ExerciseModel {
//    private String name, description;
//    private int image;
//
//    public ExerciseModel(String name, String description, int image) {
//        this.name = name;
//        this.description = description;
//        this.image = image;
//    }
//
//    public String getName() { return name; }
//    public String getDescription() { return description; }
//    public int getImage() { return image; }
//}
//package com.example.fit_life;
//
//public class ExerciseModel {
//    private String name;
//    private String description;
//    private int imageResId;
//
//    public ExerciseModel(String name, String description, int imageResId) {
//        this.name = name;
//        this.description = description;
//        this.imageResId = imageResId;
//    }
//
//    public String getName() { return name; }
//    public String getDescription() { return description; }
//    public int getImageResId() { return imageResId; }
//}
package com.example.fit_life;

public class ExerciseModel {
    private String name;
    private String shortDescription;
    private int imageResource;
    private String fullDescription;

    public ExerciseModel(String name, String shortDescription, int imageResource, String fullDescription) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.imageResource = imageResource;
        this.fullDescription = fullDescription;
    }

    public String getName() {
        return name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getFullDescription() {
        return fullDescription;
    }
}
