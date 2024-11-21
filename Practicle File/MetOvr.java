class Car {
    public String bestModel() {
        return "";
    }
}

class BMW extends Car {
    @Override
    public String bestModel() {
        return "M4 Competition";
    }
}

class Audi extends Car {
    @Override
    public String bestModel() {
        return "RS7";
    }
}

class Porsche extends Car {
    @Override
    public String bestModel() {
        return "911 gt3rs";
    }
}

public class MetOvr {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        Audi audi = new Audi();
        Porsche porsche = new Porsche();

        System.out.println(bmw.bestModel());
        System.out.println(audi.bestModel());
        System.out.println(porsche.bestModel());
    }
}
