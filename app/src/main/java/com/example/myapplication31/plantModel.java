package com.example.myapplication31;

public class plantModel {

    String plantName;
    String plantScName;
    int image;
    String description;




    public plantModel(String plantName, String plantScName, int image, String description) {

        this.plantName = plantName;
        this.plantScName = plantScName;
        this.image = image;
        this.description= description;




    }


    public String getPlantName() {return plantName;
    }

    public String getPlantScName() {
        return plantScName;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }




}

