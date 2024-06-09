// Method Overriding
class Animal {
     void sound() {
         System.out.println("no sound");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("A cat meows");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("A dog barks");
    }
}
public class Polymorphism1 {
    public static void main(String[] args) {
        Animal Dog = new Dog();
        Animal Cat = new Cat();
        Dog.sound();
        Cat.sound();
    }
}