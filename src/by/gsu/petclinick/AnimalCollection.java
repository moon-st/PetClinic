package by.gsu.petclinick;

import java.util.Arrays;

public class AnimalCollection {

    private Animal[] animals;
    private int count;
    private AnimalService service;

    public AnimalCollection(int size) {
        animals = new Animal[size];
        service = new AnimalService();
    }

    public void add() {
        Animal animal = service.createNewAnimal();
        add(animal);
    }

    public void add(Animal animal) {
        if (count == animals.length) {
            int newSize = (int) (animals.length * 1.5);
            animals = Arrays.copyOf(animals, newSize);
        }
        animals[count] = animal;
        count++;
    }

    public void update(int index) {
        Animal animal = animals[index];
        if (animal == null) {
            throw new
                    IllegalArgumentException("there is no such animal!");
        }
        service.update(animal);

    }

    public void delete(int index) {
        if (index < 0 || index >= count) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == count - 1) {
            animals[index] = null;
        } else {
            for(int i = index; i < count-1; i++) {
                animals[i] = animals[i+1];
            }
            animals[count - 1] = null;
        }
        count--;
    }

    public void printAll() {
        System.out.println(Arrays.toString(animals));
    }
}
