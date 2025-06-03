package com.forest;

public class Tree {

    //Properties
    private double size;
    private Owl resident;
    private Mushroom[] mushrooms;

    //Methods

    public void Tree(){
        this.size = 200;
        //By default, others are null since no assigned value
        this.mushrooms = new Mushroom[5]; //default value of NULL

        for (int i = 0; i < 5; i++){
            this.mushrooms[i] = new Mushroom();
        }
    }


    public void grow(){
        //increase tree size by 1
        this.size++;

        //all mushrooms growing on the tree also grows
        for (int i = 0; i < 5; i++) {
            this.mushrooms[i].grow();
        }
    }

    public double getSize(){
        return this.size;
    }

    public void setSize(double size){
        this.size = size;
    }

    public Owl getOwl(){
        return this.resident;
    }

    public void setOwl(Owl owl){
        this.resident = owl;
    }

    public Mushroom getMushroom(int index){
        return mushrooms[index];
    }

    public void setMushroom(Mushroom mushroom, int index){
        this.mushrooms[index] = mushroom;
    }
}
