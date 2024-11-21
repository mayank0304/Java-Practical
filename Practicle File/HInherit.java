
class Animal {

    public void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {

    public void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends
        Animal {

    public void
            meow() {
        System.out.println("Cat meows");
    }
}

public class HInherit {

    public static void main(String[] args) {
        // Create Dog object and callmethods
        Dog dog = new Dog();
        dog.eat(); // Inherited method from Animal
        dog.bark(); // Specific method of Dog
        // Create Cat object and call methods 
        Cat cat = new Cat();
        cat.eat(); // Inherited method from Animal
        cat.meow(); // Specific method of Cat
    }
}
