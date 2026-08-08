package OOPs;

public class Inheritance {
    public static void main(String[] args) {
        Bird ama = new Bird();
        ama.fly();
        ama.breathe();
        ama.eat();
        Fish fis = new Fish();
        fis.eat();
        fis.breathe();
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes normally :");
    }
}


class Mammal extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}


class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}