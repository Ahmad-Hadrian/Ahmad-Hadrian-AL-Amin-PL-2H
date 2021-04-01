package moreonclasses;

public class abstarctclass {
    abstract class Animal{
        public int age;
        public abstract int printAge();
    }
    class Dog extends Animal{
        public int printAge(){
            return age;
        }
    }
}

