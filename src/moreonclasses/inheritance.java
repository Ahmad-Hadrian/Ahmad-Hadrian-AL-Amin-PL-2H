package moreonclasses;

public class inheritance {
    public void makeSound(){
        System.out.println(("Hi"));
    }
}
class Dog extends inheritance{
}
class A {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}

