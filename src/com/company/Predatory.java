package com.company;

public class Predatory extends Mammals {
    private String weapon;

    public Predatory(String type, int weight, int age, String nutrition, String weapon) {
        super(type, weight, age, nutrition);
        this.weapon = weapon;
    }

    @Override
    public void print() {
        System.out.println("Type of " + getClass().getSimpleName() + " " + getType());
        System.out.println("Weight of " + getClass().getSimpleName() + " " + getWeight());
        System.out.println("Age of " + getClass().getSimpleName() + " " + getAge());
        System.out.println(getClass().getSimpleName() + " " + "feeds on " + getNutrition());
        System.out.println("Weapon of " + getClass().getSimpleName() + " " + weapon);

    }
}
