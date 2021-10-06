package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Predatory").print();
        createObject("Herbivores").print();
        createObject("Primates").print();
    }

    public static Mammals createObject(String className) {
        switch (className) {
            case ("Predatory"):
                Predatory predatory = new Predatory("Wolf", 40, 8, "meat", "Sharp teeth and claws");
                return predatory;
            case ("Herbivores"):
                Herbivores herbivores = new Herbivores("Deer", 80, 10, "plants", "Horns and hooves");
                return herbivores;
            case ("Primates"):
                Primates primates = new Primates("human", 70, 22, "omnivorous", 105);
                return primates;
        }
        return  null;
    }
}
