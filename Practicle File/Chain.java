// Constructor Chaining

public class Chain {
    public static void main(String[] args) {
        Animal obj1 = new Animal();
    }
}

class Animal {
    String name;
    String speak;

    Animal(){
        this("Cat", "Meow");
    }

    Animal(String name, String speak) {
        this.name = name;
        this.speak = speak;
        System.out.println("This is Parameterised Constructor");
        System.out.println(name + " | " + speak);
    }
}

