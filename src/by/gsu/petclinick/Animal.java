package by.gsu.petclinick;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name='" + name;
    }
}
