package moreonclasses;

public class inheritance {
    public static void main(String[] args) {
    public void makeSound(){
        System.out.println(("Hi"));
    }
}
class Dog extends inheritance{
    public void makeSound() {
    }
}
class A {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}

