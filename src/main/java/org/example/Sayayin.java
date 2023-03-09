package org.example;

public abstract class Sayayin {
    // Attributes
    private String name;
    private Integer fightPower;
    private Integer age;
    private String hairColor;

    // Constructors
    public Sayayin() {

    }

    public Sayayin(String name, Integer fightPower, Integer age, String hairColor) {
        this.name = name;
        this.fightPower = fightPower;
        this.age = age;
        this.hairColor = hairColor;
    }

    // Ordinary methods
    public void eat() {
        System.out.println("Hello i'm a sayayin and I eat a lot.");
    }

    public abstract void fight();

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFightPower() {
        return fightPower;
    }

    public void setFightPower(Integer fightPower) {
        this.fightPower = fightPower;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
