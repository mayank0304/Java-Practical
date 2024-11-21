
interface Animal { // Outer interface 
    void sound();
    interface Behavior { // Nested interface 
        void eat();
    }
}

class Dog implements Animal, Animal.Behavior {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    // Implementing the eat method from the nested interface
    @Override
    public void eat() {
        System.out.println("Dog eats dog food");
    }
}

public class Inter {

    public static void main(String[] args) {
        System.out.println("Nested Interface(Interface within Interface )");
        Dog dog = new Dog();
        dog.sound(); // Call the soundmethod dog
        dog.eat(); // Call the eat

    }
}
