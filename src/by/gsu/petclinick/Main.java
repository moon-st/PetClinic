package by.gsu.petclinick;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Tom", CatKind.BRITAN);

        Dog dog = new Dog("Tuzik", DogKind.COCER);

        AnimalFactory factory = new AnimalFactory();
        Animal animal = factory.createNewAnimal();

        System.out.println(animal);

//        AnimalCollection coll = new AnimalCollection(2);
//        coll.add(cat);
//        coll.add(dog);
//        coll.add(cat);
//        coll.add(dog);
//        coll.add(cat);
//
//        coll.delete(2);
//        coll.printAll();
    }
}
