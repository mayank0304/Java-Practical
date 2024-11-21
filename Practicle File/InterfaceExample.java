
interface Printable {
    // Defining an interface 
    void print(); // Abstract method
}

class Document implements Printable { // Implementing the interface in a class 

    @Override
    public void print() {
        System.out.println("Printing a document ...");
    }
}

class Image implements Printable {

    @Override
    public void print() {
        System.out.println("Printing an image...");
    }
}

public class InterfaceExample {

    public static void main(String[] args) {
        // Creating objects of classes that implement the Printable interface
        Printable doc = new Document();
        Printable img = new Image();
        // Calling the print method using interface references
        doc.print();
        img.print();
    }
}
