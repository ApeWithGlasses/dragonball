package org.example;

public class LowClass extends Sayayin{
    // Constructors
    public LowClass() {

    }

    public LowClass(String name, Integer fightPower, Integer age, String hairColor) {
        super(name, fightPower, age, hairColor);
    }

    @Override
    public void fight() {
        System.out.println(this.getName() + " fight with the heart.");
    }
}
