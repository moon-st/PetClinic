package by.gsu.petclinick;

public class Cat extends Animal {

    private CatKind kind;

    //фабричный метод
    public static Cat newInstance() {
        Cat cat = new Cat();
        return cat;
    }

    public Cat() {
    }

    public Cat(String name, CatKind kind) {
        super(name);
        this.kind = kind;
    }

    public CatKind getKind() {
        return kind;
    }

    public void setKind(CatKind kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "kind=" + kind +
                " " + super.toString() +
                '}';
    }
}
