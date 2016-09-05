package by.gsu.petclinick;

import java.util.Scanner;

public class AnimalFactory {
    public Animal createNewAnimal() {
        Scanner s = new Scanner(System.in);
        System.out.println("cat or dog?");

        String type = s.nextLine();

        Animal result;

        switch (type) {
            case "cat":
            case "c":
                result = readCat(s);
                break;

            case "dog":
            case "d":
                result = readDog(s);
                break;
            default:
                throw new IllegalArgumentException("undefined animal type");
        }

        return result;
    }

    private Cat readCat(Scanner s) {
        Cat cat  = new Cat();
        System.out.println("Input cat name");
        cat.setName(s.nextLine());

        System.out.println("Input cat type");
        CatKind catKind = readCatKind();
        cat.setKind(catKind);

        return cat;
    }

    private Dog readDog(Scanner s) {
        return new Dog("Tuzik", DogKind.COCER);
    }

    public void update(Animal animal) {
        Scanner s = new Scanner(System.in);
        System.out.println("input new name");
        String name = s.nextLine();

        animal.setName(name);

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.println("input new cat type");
            CatKind kind = readCatKind();

            cat.setKind(kind);
        } else if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            //
        } else {
            throw new IllegalArgumentException();
        }


    }

    private CatKind readCatKind() {
        Scanner s = new Scanner(System.in);
        CatKind[] kinds = CatKind.values();

        System.out.println("Input cat type, available types:");
        for (int i = 0; i < kinds.length; i++) {
            System.out.println(kinds[i].name());
        }

        String catEnumTypeName = s.nextLine();
        CatKind result = null;
        for (int i = 0; i < kinds.length; i++) {
            if (kinds[i].name().equalsIgnoreCase(catEnumTypeName)) {
                result = kinds[i];
                break;
            }
        }
        if (result == null) {
            throw new IllegalArgumentException("undefined cat type");
        }

        return result;
    }
}
