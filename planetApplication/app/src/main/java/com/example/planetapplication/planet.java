package com.example.planetapplication;

   //This class is acting as a Model Class for our ListView
public class planet {

    //Attributes
       private String planetName;
       private String moonCount;
       private int planetImage;

       //Constructor

       public planet(int planetImage,String planetName,String moonCount) {
           this.planetImage = planetImage;
           this.planetName = planetName;

           this.moonCount = moonCount;
       }

       //Getter & Setter


       public String getMoonCount()
       {

           return moonCount;
       }

       public int getPlanetImage() {
           return planetImage;
       }

       public void setPlanetImage(int planetImage) {
           this.planetImage = planetImage;
       }

       public String getPlanetName() {
           return planetName;
       }

       public void setPlanetName(String planetName) {
           this.planetName = planetName;
       }

       public void setMoonCount(String moonCount) {
           this.moonCount = moonCount;
       }
   }
