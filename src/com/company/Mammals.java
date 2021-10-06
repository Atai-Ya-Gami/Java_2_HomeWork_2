package com.company;

public abstract class Mammals implements Printable {
    private String type;
    private int weight;
    private int age;
    private String nutrition;

    public String getNutrition() {
        return nutrition;
    }

    public void setNutrition(String nutrition) {
        this.nutrition = nutrition;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Mammals(String type, int weight, int age, String nutrition) {
        this.type = type;
        this.weight = weight;
        this.age = age;
        this.nutrition = nutrition;
    }
}
