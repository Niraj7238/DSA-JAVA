package Loops;

public class AbstractOOPS {
    public static void main(String[] args) {
        Mustang myHorse = new Mustang();
        // animal --> horse--> Mustang
    }
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor called :");
    }

    void eat(){
        System.out.println("animals eat");
    }
    abstract void walk();
}

class horse extends Animal{
    horse(){
        System.out.println("hourse constructor called");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class chiken extends Animal{
    void changeColor(){
        color = "white";
    }
    @Override
    void walk() {
        System.out.println("walk on 2 legs");
    }
}


class Mustang extends horse{
    Mustang(){
        System.out.println(" Mustang constructor called ");
    }
}