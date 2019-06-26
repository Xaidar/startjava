package com.startjava.lesson_2_3_4.robot;

public class Jaeger {    

    private String modelName;
    private String mark;
    private String origin;
    private float heidht;
    private float weight;

    public Jaeger(String modelName, String mark, String origin, float heidht, float weight) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.heidht = heidht;
        this.weight = weight;
    }

    public void drift() {

    }

    public void move() {

    }

    public void scanKaiju() {

    }

    public void useWeapon() {
        System.out.println("Fire!!!");
    }

    public String toString() {
        return "modelName: " + modelName + 
            "; mark:" + mark + 
            "; origin:" + origin + 
            "; heidht:" + heidht + 
            "; weight:" + weight; 
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setHeidht(float heidht) {
        this.heidht = heidht;
    }

    public float getHeidht() {
        return heidht;
    }

    public void setWeidht(float weight) {
        this.weight = weight;
    }

    public float getWeidht() {
        return weight;
    }
}