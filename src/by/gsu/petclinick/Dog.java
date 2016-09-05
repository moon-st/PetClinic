package by.gsu.petclinick;

public class Dog extends Animal {

    private DogKind dogKind;

    public Dog() {
    }

    public Dog(String name, DogKind dogKind) {
        super(name);
        this.dogKind = dogKind;
    }

    public DogKind getDogKind() {
        return dogKind;
    }

    public void setDogKind(DogKind dogKind) {
        this.dogKind = dogKind;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogKind=" + dogKind +
                " " + super.toString() +
                '}';
    }
}
