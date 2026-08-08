package OOPs;

public class Polymorphism {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animals{
    void eat(){
        System.out.println("EAT ANYTHINGS:");
    }
}

class Deer extends Animals{
    void eat(){
        System.out.println("EAT GRASS:");
    }
}










class Calculator {
    int sum(int a , int b){
        return a + b;

    }

    float sum(float a , float b){
        return a + b;
    }

    int sum (int a , int b, int c ){
        return a+b+c;
    }
}
