package org.example;

public class HighClass extends Sayayin{
    // Constructors
    public HighClass() {

    }

    public HighClass(String name, Integer fightPower, Integer age, String hairColor) {
        super(name, fightPower, age, hairColor);
    }

    @Override
    public void fight() {
        System.out.println(this.getName() + " figth with elegance.");
    }
}
