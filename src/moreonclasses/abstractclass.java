package moreonclasses;

public class abstractclass {
    public static void main(String[] args) {
        abstract class Animal {
            public int age;

            public abstract int printAge();
        }
        class Dog extends Animal {
            public int printAge() {
                return age;
            }
        }
    }