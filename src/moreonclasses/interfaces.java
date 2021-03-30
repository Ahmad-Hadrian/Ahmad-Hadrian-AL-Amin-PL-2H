package moreonclasses;

public class interfaces {
    public static void main(String[] args) {
    interface Animal{
        public void eat();
    }
    class Cat implements Animal{
        public void eat(){
            System.out.println(("Cat eats"));
        }
    }
}

