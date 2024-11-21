
class animal {

    public static void eat() {
        System.out.println("Animal eats food");
    }
}

class dog extends
        animal {

    public static void bark() {
        System.out.println("Dog barks");
    }
}

class puppy extends dog {

    public static void
            play() {
        System.out.println("Puppy plays");
    }

    public static void main(String[] args) {
        puppy obj = new puppy();
        obj.eat();
        obj.bark();
        obj.play();
    }
}
