package com.company;

public class Herbivores extends Mammals{
    private String ProtectiveFeature;

    public Herbivores(String type, int weight, int age, String nutrition, String protectiveFeature) {
        super(type, weight, age, nutrition);
        ProtectiveFeature = protectiveFeature;
    }

    @Override
    public void print() {
        System.out.println("Type of " + getClass().getSimpleName() + " " + getType());
        System.out.println("Weight of " + getClass().getSimpleName() + " " + getWeight());
        System.out.println("Age of " + getClass().getSimpleName() + " " + getAge());
        System.out.println(getClass().getSimpleName() + " " + "feeds on " + getNutrition());
        System.out.println("Protective Feature of " + getClass().getSimpleName() + " " + ProtectiveFeature);


    }
}
