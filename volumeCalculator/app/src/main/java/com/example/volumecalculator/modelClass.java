package com.example.volumecalculator;

//This class is acting as : "Model class"
//It represents the data structure or individual data items
//that your adapter is going to display

public class modelClass {


    int shapeImg;
    String shapeName;

    public modelClass(int shapeImg, String shapeName) {
        this.shapeImg = shapeImg;
        this.shapeName = shapeName;
    }

    public int getShapeImg() {
        return shapeImg;
    }

    public void setShapeImg(int shapeImg) {
        this.shapeImg = shapeImg;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
}
