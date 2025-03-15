class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class AnimalSoundDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound(); 
    }
}
