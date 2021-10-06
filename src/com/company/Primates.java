package com.company;

public class Primates extends Mammals{
    private int IQ;

    public Primates(String type, int weight, int age, String nutrition, int IQ) {
        super(type, weight, age, nutrition);
        this.IQ = IQ;
    }

    @Override
    public void print() {
        System.out.println("Type of " + getClass().getSimpleName() + " " + getType());
        System.out.println("Weight of " + getClass().getSimpleName() + " " + getWeight());
        System.out.println("Age of " + getClass().getSimpleName() + " " + getAge());
        System.out.println(getClass().getSimpleName() + " " + "feeds on " + getNutrition());
        System.out.println("IQ  of " + getClass().getSimpleName() + " " + IQ);
    }
}
