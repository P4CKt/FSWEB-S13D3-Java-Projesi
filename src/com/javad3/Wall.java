package com.javad3;

public class Wall {
    double height;

    double width;


    public Wall(double height,double width){
        this.height= height;
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight (){
        return height;
    }
    public double getArea  (){
        return height*width;
    }
    public void setWidth  (double width){
         this.width=width;
    }
    public void setHeight(double height){
        this.height=height;

    }
}

