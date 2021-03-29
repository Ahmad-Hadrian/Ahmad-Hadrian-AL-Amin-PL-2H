package classesandobject;

public class creatingobject {
    public static void main(String[] args) {
    }

    public void test() {
        System.out.println("Hi");
    }
}
class B {
    public static void main(String[] args) {
        creatingobject obj=new
                creatingobject();
        obj.test();
    }

}
