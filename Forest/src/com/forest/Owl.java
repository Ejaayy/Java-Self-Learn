package com.forest; //Just means this class is in this package

public class Owl {
    private float size;
    private String color;
    private boolean satiated; //hungry or full

    public Owl(){

        this.size = 20;
        //setSize(20);
        //this.setSize(20);

        this.color = "Brown";
        //setColor("Brown");
        //this.setColor("Brown");

        this.satiated = false;

    }

    public void grow(){
        if (this.satiated){
            this.setSize(this.getSize() + 3);
            this.setSatiated(false);
            //can be this.size += 3
        }
    }
    public void eat(Mushroom mushroom){

        //You edit that mushroom size
        mushroom.setSize(mushroom.getSize()-5);

        this.setSatiated(true);
    }

    public boolean isSatiated(){
        return this.satiated;
    }

    public void setSatiated(boolean satiated){
        this.satiated = satiated;
    }


    public Owl(String color){
        this(); //calls Owl() or other constructors again relying on parameters
        this.setColor(color);
    }

    public float getSize(){
        return this.size; // can just be return size
    }

    public String getColor(){
        return this.color;
    }

    public void setSize(float size){
        this.size = size;
    }

    public void setColor(String color){
        this.color = color;
    }
}
