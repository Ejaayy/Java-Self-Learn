package com.forest;

public class Mushroom {
    private float size;

    public Mushroom(){
        this.size = 10;
    }

    public void grow(){
        this.size += 5;
    }

    public float getSize(){
        return this.size;
    }

    public void setSize(float size){
        this.size = size;
    }

}
